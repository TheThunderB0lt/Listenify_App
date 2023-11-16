package Listenify;

// Mostly the songs classes are all private -> variable & all
public class Song { // we want use this song class in other classes also, we have to set public

    // if it is public(prob -> anyone can modify) Unwanted access (obj.vble -> can modify) Xyz BY Abc
    private String songName; 
    private double duration;
    private String secretPassword;
    
    // I will create constructor here
    public Song(String songName, double duration) {
        this.songName = songName;
        this.duration = duration;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName, String password) {     // In setter i can modify conditions
        if(password.equals(secretPassword)){
            this.songName = songName;
        }
        return;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", duration=" + duration +
                '}';
    }
}
