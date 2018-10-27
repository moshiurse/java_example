package com.learn.java.oop.interfacedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Moshiur on 10/28/2018.
 */
public class InterfaceTester {

	public static void main(String[] args) {
		Player moshiur = new Player("Moshiur", 30,20);
		moshiur.setWeapon("Lati");
		System.out.println(moshiur);
		saveObject(moshiur);
		moshiur.setHitPoint(40);
		moshiur.setWeapon("Knife");
		System.out.println(moshiur);
		saveObject(moshiur);
//		loadObject(moshiur);
		saveObject(moshiur);

		ISaveable monster = new Monster("Monster", 50, 60);
		System.out.println("HitPoint of monster is : "+ ((Monster) monster).getHitPoint());
		saveObject(monster);


	}

	public static ArrayList<String> readValue(){
		ArrayList<String> values = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("Press 1 to enter String\n" +
				"Press 0 to quit");
		while (!quit){
			System.out.println("Choose an option!");
			int choice=  scanner.nextInt();
			scanner.nextLine();

			switch (choice){
				case 0:
					quit = true;
					break;
				case 1:
					System.out.println("Input a String.....");
					String stringinput = scanner.nextLine();
					values.add(index, stringinput);
					index++;
					break;
			}
		}
		return values;
	}

	public static void saveObject(ISaveable objectToSave){
		for (int i = 0; i< objectToSave.write().size(); i++){
			System.out.println("saving "+ objectToSave.write().get(i) + " To Storage Device");
		}
	}

	public static void loadObject(ISaveable objectToLoad){
		List<String> values = readValue();
		objectToLoad.read(values);
	}







}

