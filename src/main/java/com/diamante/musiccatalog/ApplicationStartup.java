package com.diamante.musiccatalog;

import com.diamante.musiccatalog.entity.Person;
import com.diamante.musiccatalog.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    PersonRepository personRepository;

    private static Logger log = LoggerFactory.getLogger(ApplicationStartup.class);

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        loadDatabase();
    }

    private void loadDatabase() {
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
}