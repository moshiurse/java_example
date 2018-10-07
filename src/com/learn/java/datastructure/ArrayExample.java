package com.learn.java.datastructure;

import java.util.Scanner;

/**
 * Created by Moshiur on 10/8/2018.
 */
public class ArrayExample {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		int[] myIntArray = new int[10];
		printArray(myIntArray);
		System.out.println("Printing Integer from getInteger : \n");
		myIntArray = getInteger(5);

		for (int i=0 ; i< myIntArray.length; i++){
			System.out.println("Element "+i + " value : "+ myIntArray[i]);
		}

		System.out.println("Avarage is : "+ getAvarage(myIntArray));


	}

public static void printArray(int[] array){
	for (int i=1; i<=array.length; i++){
		System.out.println("Element "+(i+1) + " = "+ i*10 );
	}
}

public static int[] getInteger(int number){
	int values[] = new int[number];
	System.out.println("Input your number : \n");
	for (int i=0; i<number; i++){
		values[i] = scanner.nextInt();
	}
	return values;
}

public static double getAvarage(int[] array){
	int sum = 0;
	for (int i = 0; i < array.length; i++){
		sum += array[i];
	}
	return (double)sum/(double)array.length;
}

}

