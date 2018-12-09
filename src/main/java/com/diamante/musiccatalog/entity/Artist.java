package com.diamante.musiccatalog.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ARTIST")
public class Artist implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int artistId;

    private String name;

    @ElementCollection(targetClass = Album.class)
    private Set<Album> albums;
}