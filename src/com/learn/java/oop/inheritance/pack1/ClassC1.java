package com.learn.java.oop.inheritance.pack1;

/**
 * Created by Moshiur on 10/6/2018.
 */
public class ClassC1 extends ClassA {
	public static void main(String[] args){
//		System.out.println("Private Member : "+ privateVar);
//		Cannot access private variable
		System.out.println("public Member : "+ publicVar);
		System.out.println("protected Member : "+ protectedVar);
		System.out.println("default Member : "+ defaultVar);
	}
}
