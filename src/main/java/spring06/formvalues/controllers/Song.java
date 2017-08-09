package spring06.formvalues.controllers;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Song {

        @NotNull
        private long id;
        @NotNull
        @Size(min=5, max=20)
        private String name;
        @NotNull
        @Size(min=5, max=20)
        private String artist;
        @NotNull
        @Size(min=3, max=15)
        private String album;
        @NotNull
        @Min(1)
        private int rating;
        @NotNull
        @DateTimeFormat(pattern="yyyy")
        private int year;



        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getArtist() {
                return artist;
        }

        public void setArtist(String artist) {
                this.artist = artist;
        }

        public String getAlbum() {
                return album;
        }

        public void setAlbum(String album) {
                this.album = album;
        }

        public int getRating() {
                return rating;
        }

        public void setRating(int rating) {
                this.rating = rating;
        }

        public int getYear() {
                return year;
        }

        public void setYear(int year) {
                this.year = year;
        }
}
