package com.diamante.musiccatalog.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="person")
public class Person {

    @Id
    private Long id;

    @Column(name="name")
    private String name;
}
