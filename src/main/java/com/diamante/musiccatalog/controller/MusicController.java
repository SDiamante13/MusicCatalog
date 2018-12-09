package com.diamante.musiccatalog.controller;

import com.diamante.musiccatalog.entity.Artist;
import com.diamante.musiccatalog.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/artists")
public class MusicController {

    @Autowired
    ArtistRepository artistRepository;

    @PostMapping
    public ResponseEntity<Object> createArtist(Artist artist){
        artistRepository.save(artist);

        return ResponseEntity.ok().body("Created");
    }


    @GetMapping(path="/{name}")
    public ResponseEntity<Artist> retrieveArtist(@PathVariable String name){
        Optional<Artist> artist = artistRepository.findByName(name);
        if(artist == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(artist.get());
    }

    @GetMapping
    public ResponseEntity<Iterable<Artist>> retrieveAllArtists(){
        Iterable<Artist> artists = artistRepository.findAll();
        if(artists == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(artists);
    }



    /*
{
    "name": "Sean",
    "albums": [
        {
            "title": "A1"
        },
        {
            "title": "A2"
        },
        {
            "title": "A3"
        }
    ]
}
    */



}
