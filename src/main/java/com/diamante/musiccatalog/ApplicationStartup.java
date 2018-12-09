package com.diamante.musiccatalog;

import com.diamante.musiccatalog.entity.Album;
import com.diamante.musiccatalog.entity.Artist;
import com.diamante.musiccatalog.entity.Person;
import com.diamante.musiccatalog.repository.ArtistRepository;
import com.diamante.musiccatalog.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    ArtistRepository artistRepository;

    private static Logger log = LoggerFactory.getLogger(ApplicationStartup.class);

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        loadDatabaseWithArtists();
        loadDatabaseWithPeople();
    }

    private void loadDatabaseWithPeople() {
        Person steven = Person
                .builder()
                .id(1L)
                .name("Steven")
                .build();

        Person chintu = Person
                .builder()
                .id(2L)
                .name("Chintu")
                .build();

        Person aadya = Person
                .builder()
                .id(3L)
                .name("Aadya")
                .build();

        Person krithika = Person
                .builder()
                .id(4L)
                .name("Krithika")
                .build();

        List<Person> people = Arrays.asList(steven, chintu, aadya, krithika);
        personRepository.saveAll(people);
        log.info("People loaded into database");
    }

    private void loadDatabaseWithArtists() {
        Album AM = Album
                .builder()
                .title("AM")
                .build();
        Album whatever = Album
                .builder()
                .title("Whatever People Say I Am, That's What I'm Not")
                .build();
        Album humbug = Album
                .builder()
                .title("Humbug")
                .build();

        Set<Album> albumSet1 = Stream
                .of(AM, whatever, humbug)
                .collect(Collectors.toSet());
        Artist articMonkeys = Artist
                .builder().name("Artic_Monkeys")
                .albums(albumSet1)
                .build();

        Album bigMess = Album
                .builder()
                .title("Big Mess")
                .build();
        Album rumors = Album
                .builder()
                .title("Spreading Rumours")
                .build();
        Album happy = Album
                .builder()
                .title("Never Trust a Happy Song")
                .build();

        Set<Album> albumSet2 = Stream
                .of(bigMess, rumors, happy)
                .collect(Collectors.toSet());
        Artist groupLove = Artist
                .builder().name("Group_Love")
                .albums(albumSet2)
                .build();

        List<Artist> artists = Arrays.asList(articMonkeys, groupLove);
        artistRepository.saveAll(artists);
        log.info("Artists loaded into database");
    }
}