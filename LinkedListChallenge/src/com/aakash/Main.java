package com.aakash;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Night is the new day", "Katatonia");
        album.addSong("Forsaker", 4.05);
        album.addSong("The Longest Year", 4.58);
        album.addSong("Idle Blood", 3.05);
        album.addSong("Onward into Battle", 4.14);
        album.addSong("Liberation", 4.05);
        album.addSong("The Promise of Deceit", 2.15);
        album.addSong("New Night", 3.20);
        album.addSong("Inheritance", 5.05);
        album.addSong("Day and Then the Shade", 4.40);
        album.addSong("Depart", 2.42);
        albums.add(album);

        album = new Album("Fiction", "Dark Tranquillity");
        album.addSong("Nothing to No One", 2.50);
        album.addSong("The Lesser Faith", 4.40);
        album.addSong("Terminus", 2.00);
        album.addSong("Icipher", 5.50);
        album.addSong("Empty Me", 7.14);
        album.addSong("Misery's Crown", 4.52);
        album.addSong("The Mundane and the Magic", 3.50);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Forsaker", playList);
        albums.get(0).addToPlayList("The Longest Year", playList);
        albums.get(0).addToPlayList("Deliberation", playList); // Does not exist
        albums.get(0).addToPlayList(9, playList);

        albums.get(1).addToPlayList(1, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(24, playList); // Does not exist

        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No song in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We have reached at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now plating " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\nPress");
        System.out.println("0 - To quit\n" +
                "1 - To play next song\n" +
                "2 - To play previous song\n" +
                "3 - To replay the current song\n" +
                "4 - To list in the playlist\n" +
                "5 - Print available actions\n" +
                "6 - Delete current song from the playlist");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("===================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("===================================");

    }
}
