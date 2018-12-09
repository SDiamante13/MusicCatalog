package com.diamante.musiccatalog.repository;

import com.diamante.musiccatalog.entity.Artist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArtistRepository extends CrudRepository <Artist, String> {
    Optional<Artist> findByName(String name);
}
