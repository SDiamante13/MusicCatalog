package com.diamante.musiccatalog.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Album implements Serializable {
    private String title;
}