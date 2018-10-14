package com.learn.java.datastructure.linkedlist;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

/**
 * Created by Moshiur on 10/14/2018.
 */
public class MusicLinkedListTester {

	private static ArrayList<Album> albums = new ArrayList<Album>();
	public static void main(String[] args) {
		Album oniketprantor = new Album("Oniket Prantor", "Artcell");

		oniketprantor.addSong("Oniket Prantor", 16.20);
		oniketprantor.addSong("Chayar Ninad", 5.23);
		oniketprantor.addSong("Dhusor Somoy", 6.20);
		oniketprantor.addSong("Gontobbohin", 6.20);
		oniketprantor.addSong("Shohid shoroni", 6.20);
		oniketprantor.addSong("Smriti sharok", 6.20);
		albums.add(oniketprantor);

		Album eccheghuri = new Album("Ecche Ghuri", "Shironamhin");
		eccheghuri.addSong("Borosha", 5.24);
		eccheghuri.addSong("Pakhi", 5.24);
		eccheghuri.addSong("Hasimukhey", 5.24);
		eccheghuri.addSong("Cafeteria", 5.24);
		eccheghuri.addSong("Ecche Ghuri", 5.24);
		eccheghuri.addSong("Swadesh", 5.24);
		albums.add(eccheghuri);

		LinkedList<Song> playList = new LinkedList<Song>();
		oniketprantor.addSongToPlayList("Oniket Prantor", playList);
		eccheghuri.addSongToPlayList(2, playList);
		eccheghuri.addSongToPlayList(5, playList);

		play(playList);
	}

private static void play(LinkedList<Song> playList) {
	Scanner scanner = new Scanner(System.in);
	boolean quit = false;
	boolean forward = true;

	ListIterator<Song> listIterator = playList.listIterator();
	if (playList.size() == 0){
		System.out.println("No song in the playlist");
		return;
	}else {
		System.out.println("Now Playing ....... "+ listIterator.next().toString());
		printMenu();
	}

	while (!quit){
		int action=  scanner.nextInt();
		scanner.nextLine();

		switch (action){
			case 0:
				System.out.println("PlayList Close or complete!");
				quit = true;
				break;
			case 1:
				if (!forward){
					if (listIterator.hasNext()){
						listIterator.next();
					}
					forward = true;

				}
				if (listIterator.hasNext()){
					System.out.println("Now Playing ... "+ listIterator.next().toString());
				}else {
					System.out.println("We are at the end of the playlist");
					forward = false;
				}
				break;
			case 2:
				if (forward){
					if (listIterator.hasPrevious()){
						listIterator.previous();
					}
					forward = false;

				}
				if (listIterator.hasPrevious()){
					System.out.println("Now Playing ... "+ listIterator.previous().toString());
				}else {
					System.out.println("We are at startt of the playlist");
					forward = true;
				}
				break;
			case 3:
				if (forward){
					if (listIterator.hasPrevious()){
						System.out.println("Now Replying........... "+ listIterator.previous().toString());
						forward = false;
					}else {
						System.out.println("We are at the starting point or the playlist");
					}
				}else {
					if (listIterator.hasNext()){
						System.out.println("Now Replying........... "+ listIterator.next().toString());
					}else {
						System.out.println("We are at the end of the playlist");
					}
				}
				break;
			case 4:
				printPlayList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if (playList.size() >0 ){
					listIterator.remove();
					if (listIterator.hasNext()){
						System.out.println("Now Playing ........ "+ listIterator.next());
					}else if(listIterator.hasPrevious()){
						System.out.println("Now Playing ........ "+ listIterator.previous());
					}
				}
				break;


		}
	}


}

private static void printMenu() {
	System.out.println("Press 0 to quit\n" +
						"Press 1 to play next song\n" +
						"Press 2 to play previous song\n" +
						"Press 3 to replay the current song\n" +
						"Press 4 to print playlist\n" +
						"Press 5 to print menu\n"+
						"Press 6 to Delete Current song from palylist\n");

}

private static void printPlayList(LinkedList<Song> playList) {
	Iterator<Song> iterator = playList.iterator();
	System.out.println("````````````````````````````````");
	while (iterator.hasNext()){
		System.out.println(iterator.next());
	}
	System.out.println("````````````````````````````````");

}


}
