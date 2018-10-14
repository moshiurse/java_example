package com.learn.java.datastructure.linkedlist;

/**
 * Created by Moshiur on 10/14/2018.
 */
public class Song {
	private String title;
	private double duration;

public Song(String name, double duration) {
	this.title = name;
	this.duration = duration;
}

public String getTitle() {
	return title;
}

@Override
public String toString() {
	return "Song{" +
			"title='" + this.title + '\'' +
			", duration=" + this.duration +
			'}';
}
}
