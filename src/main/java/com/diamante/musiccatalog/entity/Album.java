package com.diamante.musiccatalog.entity;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Objects;

public class Album {
    private String title;
    private ArrayList<Song> songs;

    public Album() {
    }

    public Album(String title, ArrayList<Song> songs) {
        this.title = title;
        this.songs = songs;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", songs=" + songs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(title, album.title) &&
                Objects.equals(songs, album.songs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, songs);
    }
}
