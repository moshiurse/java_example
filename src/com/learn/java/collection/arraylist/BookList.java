package com.learn.java.collection.arraylist;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by Moshiur on 10/8/2018.
 */
public class BookList {
	private ArrayList<String> bookList = new ArrayList<String>();

	public void addbook(String item){
		bookList.add(item);
	}

	public void printBookList(){
		System.out.println("Book List size : "+ bookList.size());
		for (int i = 0; i< bookList.size(); i++){
			System.out.println("Element : "+ (i+1) + " Value : "+ bookList.get(i));
		}
	}

	public void updateBookItem(int position, String item){
		bookList.set(position, item);
		System.out.println("Book Item :" +(position+1) + " modified");
	}

	public void deleteBook(int position){
		String item = bookList.get(position);
		bookList.remove(position);
		System.out.println(item + "has been deleted !");
	}

	public String findBook(String search){
//		boolean exists = bookList.contains(search);
		int position = bookList.indexOf(search);
		if (position >= 0){
			return bookList.get(position);
		}
		return null;
	}

}
