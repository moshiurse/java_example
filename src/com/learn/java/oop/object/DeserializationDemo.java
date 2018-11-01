package com.learn.java.oop.object;

import java.io.*;

/**
 * Created by Moshiur on 11/1/2018.
 */
public class DeserializationDemo {

public static void main(String[] args) {

	try {
		DeserializationDemo deserialization;
		FileInputStream file = new FileInputStream("file.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(file);
		deserialization = (DeserializationDemo)objectInputStream.readObject();

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}


}

}
