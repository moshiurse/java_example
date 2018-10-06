package com.learn.java.oop.inheritance.pack1;

import com.learn.java.oop.inheritance.pack1.ClassA;
import com.learn.java.oop.inheritance.pack1.ClassC1;
import com.learn.java.oop.inheritance.pack2.ClassB2;
import com.learn.java.oop.inheritance.pack2.ClassC2;

/**
 * Created by Legend Of Legends on 10/6/2018.
 */
public class ClassB1 {

public static void main(String[] args){

	System.out.println("ClassA.publicVar : "+ ClassA.publicVar);
	System.out.println("ClassC1.publicVar : "+ ClassC1.publicVar);
	System.out.println("ClassC2.publicVar : "+ ClassC2.publicVar);

	System.out.println("ClassA.protectedVar : "+ ClassA.protectedVar);
	System.out.println("ClassC1.protectedVar : "+ ClassC1.protectedVar);
	System.out.println("ClassC2.protectedVar : "+ ClassC2.protectedVar);

	System.out.println("ClassA.defaultVar : "+ ClassA.defaultVar);
	System.out.println("ClassC1.defaultVar : "+ ClassC1.defaultVar);
}

}
