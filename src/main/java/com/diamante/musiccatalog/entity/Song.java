package com.diamante.musiccatalog.entity;


import java.util.Objects;

public class Song {
    private Long number;
    private String title;

    public Song() {
    }

    public Song(Long number, String title) {
        this.number = number;
        this.title = title;
    }

    public Long getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Song{" +
                "number=" + number +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(number, song.number) &&
                Objects.equals(title, song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, title);
    }


}
