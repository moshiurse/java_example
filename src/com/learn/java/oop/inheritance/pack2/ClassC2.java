package com.learn.java.oop.inheritance.pack2;

import com.learn.java.oop.inheritance.pack1.ClassA;

/**
 * Created by Legend Of Legends on 10/6/2018.
 */
public class ClassC2 extends ClassA{

	public static void main(String[] args){
//		System.out.println("Private Member : "+ privateVar);
//		Cannot access private from another package
		System.out.println("public Member : "+ publicVar);
		System.out.println("protected Member : "+ protectedVar);
//		System.out.println("default Member : "+ defaultVar);
//		Cannot access default modifier variable from another package

	}

}
