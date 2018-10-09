package com.learn.java.collection.autoboxunbox;

import java.util.ArrayList;

/**
 * Created by Moshiur on 10/9/2018.
 */
public class AutoBoxUnBoxTester {
	public static void main(String[] args){
		ArrayList<String> stringArrayList = new ArrayList<String>();
		stringArrayList.add("Moshiur");
//		ArrayList<int> intArrayList = new ArrayList<int>();

		ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
		intClassArrayList.add(new IntClass(50));

		Integer integer = new Integer(50);

		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

		for (int i = 0; i<10; i++){
			integerArrayList.add(Integer.valueOf((i+1)*10));
		}
		System.out.println("Printing Integer ArrayList............");
		for (int i = 0; i<10; i++){
			System.out.println((i+1) + "=> "+integerArrayList.get(i).intValue());
		}

		Integer myIntValue = 60;
		int myInt = myIntValue.intValue();

		ArrayList<Double> doubleArrayList = new ArrayList<Double>();
		for (double i = 0.0; i<10.0; i+= 0.5){
			doubleArrayList.add(Double.valueOf(i));
		}
		System.out.println("Printing Double Values............");
		for (int i = 0; i<doubleArrayList.size(); i++){
			System.out.println((i+1)+ " => "+doubleArrayList.get(i).doubleValue());
		}


	}
}
