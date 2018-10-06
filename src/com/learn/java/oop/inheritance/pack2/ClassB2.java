package com.learn.java.oop.inheritance.pack2;

import com.learn.java.oop.inheritance.pack1.ClassA;
import com.learn.java.oop.inheritance.pack1.ClassC1;

/**
 * Created by Legend Of Legends on 10/6/2018.
 */
public class ClassB2 {

public static void main(String[] args){

	System.out.println("ClassA.publicVar : "+ ClassA.publicVar);
	System.out.println("ClassC1.publicVar : "+ ClassC1.publicVar);
	System.out.println("ClassC2.publicVar : "+ ClassC2.publicVar);

//	System.out.println("ClassA.protectedeVar : "+ ClassA.protectedeVar);
//	System.out.println("ClassC1.defaultVar : "+ ClassC1.defaultVar);
//	Cannot Access default private protected fromother package even without extending
}
}
