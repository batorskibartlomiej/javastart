package Exercises.musicSongs;

import java.util.List;
import java.util.stream.Collectors;

class MusicCollection {
    public static void main(String[] args) {
        List<Song> songs = List.of(
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("No One", 248, "Alicia Keys", Song.Genre.POP),
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("Believer", 216, "Imagine Dragons", Song.Genre.ROCK),
                new Song("Fear of The Dark", 438, "Iron Maiden", Song.Genre.METAL),
                new Song("Enter Sandman", 346, "Metallica", Song.Genre.METAL),
                new Song("The Unforgiven", 348, "Metallica", Song.Genre.METAL),
                new Song("Girl on Fire", 404, "Alicia Keys", Song.Genre.POP)
        );

        int totalPopLength = totalLengthByGenre(songs, Song.Genre.POP);
        System.out.println("Łączny czas piosenek popowych na playliście (w sekundach): " + totalPopLength);

        long metallica = totalSongsByArtist(songs, "Metallica");
        System.out.println("Wszystkie nuty metallici "+metallica);

        List<Song> songsWithoutPop = songsWithGenreFiltered(songs, Song.Genre.POP);
        songsWithoutPop.forEach(System.out::println);


    }


    static int totalLengthByGenre(List<Song> songs, Song.Genre genre) {
        return songs.stream()
                .filter(song -> song.getGenre() == genre)
                .mapToInt(Song::getLength)
                .sum();
    }


    static long totalSongsByArtist(List<Song>songs, String artist){
        return songs.stream()
                .filter(song -> song.getArtist().equals(artist))
                .count();
    }


    static List<Song> songsWithGenreFiltered(List<Song> songs, Song.Genre genreToremove){
        return songs.stream()
                .filter(song -> song.getGenre()!=genreToremove)
                .distinct()
                .collect(Collectors.toList());
    }


}