package com.diamante.musiccatalog;

import com.diamante.musiccatalog.entity.Person;
import com.diamante.musiccatalog.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MusicCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicCatalogApplication.class, args);
	}

}
