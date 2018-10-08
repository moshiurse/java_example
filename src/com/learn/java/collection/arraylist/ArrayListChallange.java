package com.learn.java.collection.arraylist;

import java.util.Scanner;

/**
 * Created by Moshiur on 10/8/2018.
 */
public class ArrayListChallange {
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("880 1962 476055");

	public static void main(String[] args){
		boolean quit = false;
		startPhone();
		printManual();

		while (!quit){
			System.out.println("Enter Action(6 to show all available action.)");
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action){
				case 0:
					System.out.println("Phone shutting down././././../././/./.");
					quit = true;
					break;
				case 1:
					printContacts();
					break;
				case 2:
					addNewContact();
					break;
				case 3:
					updateContact();
					break;
				case 4:
					deleteContact();
					break;
				case 5:
					queryContact();
					break;
				case 6:
					printManual();
					break;
			}

		}

	}

private static void queryContact() {
	System.out.println("Enter existing contact to Query");
	String name = scanner.nextLine();
	Contact existing = mobilePhone.queryContact(name);
	if (existing ==  null){
		System.out.println("Contact not found!");
		return;
	}

	System.out.println("Name : "+ existing.getName() + "=>Phone: "+ existing.getPhoneNumber());
}

private static void deleteContact() {
	System.out.println("Enter existing contact to Delete");
	String name = scanner.nextLine();
	Contact existing = mobilePhone.queryContact(name);
	if (existing ==  null){
		System.out.println("Contact not found!");
		return;
	}

	if (mobilePhone.removeContact(existing)){
		System.out.println("Contact Deleted successfully");
	}else{
		System.out.println("Filed to Delete contact");
	}
}

private static void updateContact() {
	System.out.println("Enter existing contact to update");
	String name = scanner.nextLine();
	Contact existing = mobilePhone.queryContact(name);
	if (existing ==  null){
		System.out.println("Contact not found!");
		return;
	}
	System.out.println("Enter new Contact Name: ");
	String newName = scanner.nextLine();
	System.out.println("Enter new Contact Number: ");
	String newPhone = scanner.nextLine();
	Contact newContact = Contact.createContact(newName, newPhone);
	if (mobilePhone.updateContact(existing, newContact)){
		System.out.println("Contact Updated successfully");
	}else{
		System.out.println("Filed to update contact");
	}

}

private static void addNewContact() {
	System.out.println("Create a new Contact.... ");
	System.out.println("Enter Contact name :");
	String name = scanner.nextLine();
	System.out.println("Enter Contact Number :");
	String phone = scanner.nextLine();
	Contact newContact = Contact.createContact(name, phone);

	if (mobilePhone.addNewContact(newContact)){
		System.out.println("New Contact added. name : "+name + ", phone : "+ phone);
	}else {
		System.out.println("Name already exists on mobile.");
	}

}

private static void printContacts() {
	mobilePhone.printContacts();
}

private static void printManual() {
	System.out.println("See Available Action : ");
	System.out.println(	"Press 0 to ShutDown\n"  +
						"Press 1 to Print Contacts\n"  +
						"Press 2 to add new contact\n"  +
						"Press 3 to Update a contact\n"  +
						"Press 4 to remove existing contact\n" +
						"Press 5 to query if an existing contact exists\n"  +
						"Press 6 to See all available Action\n");
	System.out.println("Chhose your action : ");
}

private static void startPhone() {

	System.out.println("Starting my phone ././././././././././.");
}
}
