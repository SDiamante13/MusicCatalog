package com.diamante.musiccatalog.repository;

import com.diamante.musiccatalog.entity.Artist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends CrudRepository <Artist, String> {
}
