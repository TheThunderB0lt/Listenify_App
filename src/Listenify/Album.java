package Listenify;

import java.util.*;

// The most common use of the this keyword is to eliminate the confusion between class 
// attributes and parameters with the same name

public class Album {

    private List<Song> songList;

    public Album(String singerName) {
        this.songList = new ArrayList<>();
    }

    public Album(String singerName, List<Song> songList) {
        this.songList = songList;
    }

    public boolean findSongAlbum(String songName){
        for(Song song : songList) {
            if(song.getSongName().equals(songName)) {
                return true;
            }
        }
        return false;
    }

    public String addSongToAlbum(String songName, double duration) {
        if(findSongAlbum(songName)) {
            return "Song is already present in Album";
        }

        Song newSong = new Song(songName, duration);
        songList.add(newSong);
        return "New Song has been added";
    }

    public String addSongToPlaylist(int songNo, List<Song> playlist) {
        int idx = songNo -1;
        if(idx >= 0 && idx < songList.size()) {
            Song songObj = songList.get(idx);
            playlist.add(songObj);
            return "Song added successfully";
        } 
        return "Invalid songNo";
    }

    public String addSongToPlaylist(String songName, List<Song> playlist) {
        for(Song song : songList) {
            if(song.getSongName().equals(songName)) {
                playlist.add(song);
                return "Song added to playlist";
            }
        }
        return "No song with this songName existed in the album SongList";
    }

}
