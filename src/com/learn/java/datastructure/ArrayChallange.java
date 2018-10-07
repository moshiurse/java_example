package com.learn.java.datastructure;

import java.util.Scanner;

/**
 * Created by Moshiur on 10/8/2018.
 */
public class ArrayChallange {

private static Scanner scanner = new Scanner(System.in);

public static void main(String[] args){
	int[] myInt = getInt(5);
	System.out.println("Unsorted Array.......................");
	printArray(myInt);
	int[] sorted = sortInteger(myInt);
	System.out.println("Sorted Array.......................");
	printArray(sorted);
}

public static int[] getInt(int number) {
	int[] array = new int[number];
	System.out.println("Input your Array ");
	for (int i=0; i<array.length; i++){
		array[i] = scanner.nextInt();
	}
	return array;
}

public static void printArray(int[] array){
	for (int i = 0; i<array.length; i++){
		System.out.println("Element "+ i + " Values: "+ array[i]);
	}
}

public static int[] sortInteger (int[] array){
	int sortedArray[] = new int[array.length];
	for (int i = 0; i<array.length; i++){
		sortedArray[i] = array[i];
	}
	boolean flag = true;
	int temp;

	while (flag){
		flag = false;
		for (int i = 0; i<sortedArray.length-1; i++){
			if (sortedArray[i] < sortedArray[i+1]){
				temp = sortedArray[i];
				sortedArray[i] = sortedArray[i+1];
				sortedArray[i+1] = temp;
				flag = true;
			}
		}
	}
	return sortedArray;
}


}
