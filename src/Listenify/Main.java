package Listenify;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! To My Listenify Application");

        Album a1 = new Album("Arjit Singh");
        a1.addSongToAlbum("A", 5.1);
        a1.addSongToAlbum("B", 5.2);
        a1.addSongToAlbum("C", 5.3);
        a1.addSongToAlbum("D", 5.4);
        a1.addSongToAlbum("E", 5.5);
        
        Album a2 = new Album("Yo Yo Honey Singh");
        a2.addSongToAlbum("F", 4.1);
        a2.addSongToAlbum("G", 4.2);
        a2.addSongToAlbum("H", 4.3);
        a2.addSongToAlbum("I", 4.4);
        a2.addSongToAlbum("J", 4.5);

        List<Song> playlist = new ArrayList<>();
        a1.addSongToPlaylist(1, playlist);
        a1.addSongToPlaylist(3, playlist);
        a1.addSongToPlaylist(5, playlist);

        a2.addSongToPlaylist("H", playlist);
        a2.addSongToPlaylist("I", playlist);
        a2.addSongToPlaylist("J", playlist);

        int currIdx = 0;
        System.out.println("Now playing " + playlist.get(currIdx).toString());

        printMenu();

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        boolean keepPlayingPlayList = true;

        while(keepPlayingPlayList) {
            switch(choice) {
                case 1: 
                    if(currIdx != playlist.size() - 1)
                        currIdx++;
                    else 
                        currIdx = 0;
                    System.out.println("Now playing: " + playlist.get(currIdx).toString());
                    break;

                case 2:
                    if(currIdx != 0){
                        currIdx--;
                    }
                    System.out.println("Now Playing: " + playlist.get(currIdx).toString());
                    break;

                case 3:
                    System.out.println("Now Playing: " + playlist.get(currIdx).toString());
                    break;

                case 4:
                    printPlaylist(playlist);
                    break;

                case 5:
                    Collections.shuffle(playlist);
                    break;

                case 6:
                    printMenu();
                    break;
                
                case 7:
                    keepPlayingPlayList = false;
                    break;
            }
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.close();
        }
    }

    public static void printPlaylist(List<Song> playlist) {
        System.out.println("The Playlist songs are: ");
        for(Song song : playlist){
            System.out.println(song.toString());
        }
    }

    public static void printMenu() {
        System.out.println("Enter your choice");
        System.out.println("1. Play next song");
        System.out.println("2. Play previous song");
        System.out.println("3. Repeat the current song");
        System.out.println("4. Show playlist");
        System.out.println("5. Shuffle playlist");
        System.out.println("6. Print Menu");
        System.out.println("7. Exit");
    }
}
