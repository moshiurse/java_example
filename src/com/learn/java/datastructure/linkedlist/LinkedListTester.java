package com.learn.java.datastructure.linkedlist;

import java.util.*;

/**
 * Created by Moshiur on 10/10/2018.
 */
public class LinkedListTester {
public static void main(String[] args){

//		Checking normal Object and comparing
	Customer customer = new Customer("Moshiur", 150.00);
	Customer anotherCustomer;
	anotherCustomer = customer;
	anotherCustomer.setBalance(20.00);

	System.out.println("Balance for customer " + anotherCustomer.getName() + " is => "+ anotherCustomer.getBalance());
//		ArrayList Formula
	ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
	integerArrayList.add(1);
	integerArrayList.add(2);
	integerArrayList.add(4);

	for (int i = 0; i< integerArrayList.size(); i++){
		System.out.println((i+1) + " = >" + integerArrayList.get(i));
	}

	integerArrayList.add(2, 3);
	for (int i = 0; i< integerArrayList.size(); i++){
		System.out.println((i+1) + " = >" + integerArrayList.get(i));
	}

	LinkedList<String> localPlace = new LinkedList<String>();
	addInOrder(localPlace, "Mymensingh");
	addInOrder(localPlace, "Dhaka");
	addInOrder(localPlace, "Chittagong");
	addInOrder(localPlace, "Barishal");
	addInOrder(localPlace, "Rangpur");
	addInOrder(localPlace, "Khulna");
	printList(localPlace);

	addInOrder(localPlace, "Mymensingh");
	addInOrder(localPlace, "Rajshahi");
	printList(localPlace);

	visit(localPlace);

//		localPlace.add("Mymensingh");
//		localPlace.add("Dhaka");
//		localPlace.add("Chittagong");
//		localPlace.add("Barishal");
//		localPlace.add("Rangpur");
//		localPlace.add("Khulna");
//
//		printList(localPlace);
//
//		localPlace.add(2,"Rajshahi");
//		printList(localPlace);
//
//		localPlace.remove(3);
//		printList(localPlace);

}

private static boolean addInOrder(LinkedList<String> linkedList, String newPlace){
	ListIterator<String> stringListIterator = linkedList.listIterator();

	while (stringListIterator.hasNext()){
		int comparison = stringListIterator.next().compareTo(newPlace);
		if (comparison == 0){
			System.out.println(newPlace+ " is already in list!");
			return false;
		}else if (comparison > 0 ){
			stringListIterator.previous();
			stringListIterator.add(newPlace);
			return true;
		} else if (comparison < 0){

		}
	}

	stringListIterator.add(newPlace);
	return true;
}

private static void printList(LinkedList<String> linkedList) {
	Iterator<String> iterator = linkedList.iterator();
	while (iterator.hasNext()){
		System.out.println("Place to visit : => "+iterator.next());
	}
	System.out.println("*************LinkedList*************");

}

private static void visit(LinkedList cities){
	Scanner scanner = new Scanner(System.in);
	boolean quit = false;
	ListIterator<String> listIterator = cities.listIterator();

	if (cities.getFirst() == ""){
		System.out.println("No cities in the list!");
		return;
	}else{
		System.out.println("Visiting...... "+ listIterator.next());
		printMenu();
	}

	while (!quit){
		int action = scanner.nextInt();
		scanner.nextLine();

		switch (action){
			case 0:
				System.out.println("Vacation is over!");
				quit = true;
				break;
			case 1:
				if (listIterator.hasNext()){
					System.out.println("Visiting....... "+ listIterator.next());
				}else {
					System.out.println("Reached the end of the list!");
				}
				break;
			case 2:
				if (listIterator.hasPrevious()){
					System.out.println("Visiting....... "+ listIterator.previous());
				}else {
					System.out.println("We are just starting our journey!");
				}
				break;
			case 3:
				printMenu();
				break;
		}

	}

}

private static void printMenu() {
	System.out.println("Available Actions : \n " +
			"Press 0 -  quit \n" +
			"Press 1 -  go to next city \n" +
			"Press 2 -  go to previous city \n" +
			"Press 3 -  Show Menu \n");
}


}
