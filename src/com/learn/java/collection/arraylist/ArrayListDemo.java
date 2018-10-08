package com.learn.java.collection.arraylist;

import java.util.Scanner;

public class ArrayListDemo {

	private static Scanner scanner = new Scanner(System.in);
	private static BookList bookList = new BookList();

	public static void main(String[] args) {

		boolean quite = false;
		int choice = 0;
		printManual();

		while (!quite){
			System.out.println("Enter your choice : ");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice){
				case 0:
					printManual();
					break;
				case 1:
					bookList.printBookList();
					break;
				case 2:
					addbook();
					break;
				case 3:
					updateBookItem();
					break;
				case 4:
					deleteBook();
					break;
				case 5:
					findBook();
					break;
				case 6:
					quite = true;
					break;
			}
		}

	}

private static void findBook() {
	System.out.println("Enter item to search: ");
	String searchItem = scanner.nextLine();

	if (bookList.findBook(searchItem) != null){
		System.out.println(searchItem + " Found in book");
	} else {
		System.out.println(searchItem + " is not found");
	}
}

private static void deleteBook() {
	System.out.println("Enter item number");
	int itemNo = scanner.nextInt();
	scanner.nextLine();
	bookList.deleteBook(itemNo-1);
}

private static void updateBookItem() {
	System.out.println("Enter item number");
	int itemNo = scanner.nextInt();
	scanner.nextLine();
	System.out.println("Enter Replacement item");
	String newItem = scanner.nextLine();
	bookList.updateBookItem(itemNo-1, newItem);
}

private static void addbook() {
	System.out.println("Please enter the book name");
	String item =scanner.nextLine();
	bookList.addbook(item);
}

private static void printManual() {
	System.out.println("Press ");
	System.out.println("\t 0 to see instruction!");
	System.out.println("\t 1 to print array !");
	System.out.println("\t 2 to add item!");
	System.out.println("\t 3 to update item!");
	System.out.println("\t 4 to delete an item!");
	System.out.println("\t 5 to search an item!");
	System.out.println("\t 6 to quit the app!");
}


}


//		Collection<Integer> list = new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(10);
//		list.add(40);
//		list.add(null);
//
//		System.out.println("ArrayList : "+list);
//		list.remove(2);
//		System.out.println("ArrayList : "+list);
//		list.remove(2);
//		System.out.println("ArrayList : "+list);
//
//
//		List<Integer> list1 = new ArrayList<>();
//		list1.add(10);
//		list1.add(11);
//		list1.add(25);
//		list1.add(10);
//		list1.add(30);
//		list1.add(null);
//
//		System.out.println("List : "+list1);
//		list1.remove(2);
//		System.out.println("List : "+list1);
//		list1.remove(2);
//		System.out.println("List : "+list1);
//		list1.add(0, 50);
//		System.out.println("List add: "+list1);
//		list1.set(0, 13);
//		System.out.println("List Set: "+list1);
//
//		list.removeAll(list1);
//		System.out.println("List RemoveAll: "+list);
//
//		list.retainAll(list1);
//		System.out.println("List RetainAll : "+list);
//
//		list.addAll(list1);
//		System.out.println("List AddAll: "+list);
//
//		System.out.println("Contains 11: "+list1.contains(11));
//		System.out.println("IndexOf 11: "+list1.indexOf(11));
//		System.out.println("Last IndexOf 11: "+list1.lastIndexOf(11));
//
//		System.out.println(list1);
//		List<Integer> list2 = list1.subList(2, 3);
//		System.out.println(list2);
//		list2.set(0, 6);
//		System.out.println(list1);
//		list2.add(0, 7);
//		System.out.println(list1);
//
//		for(int element : list2){
//			System.out.println("Element: "+ element);
//		}
//