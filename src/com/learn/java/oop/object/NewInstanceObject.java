package com.learn.java.oop.object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Moshiur on 11/1/2018.
 */
public class NewInstanceObject implements Cloneable, Serializable{

String name = "Moshiur";
int count = 0;

public NewInstanceObject(String name, int count) {
	this.name = name;
	this.count = count;
}

@Override
protected Object clone() throws CloneNotSupportedException {
	return super.clone();
}

public static void main(String[] args) {
//	Object create step 1
	NewInstanceObject newInstanceObject = new NewInstanceObject("Moshiur", 1);
	System.out.println(newInstanceObject);

//	second step of creating Object
	try {
		Class cls = Class.forName("NewInstanceObject");
		NewInstanceObject object = (NewInstanceObject) cls.newInstance();
		System.out.println(object.name);
		System.out.println(object.count);
	} catch (InstantiationException e) {
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		e.printStackTrace();

	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}

//	Step 3 using clonable
	try {
		NewInstanceObject clonableObject = (NewInstanceObject) newInstanceObject.clone();
		System.out.println(clonableObject.name);
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}

//	Step 4 using Serializable object
	try {
		NewInstanceObject serializableObject = new NewInstanceObject("Rahman", 10);
		FileOutputStream file = new FileOutputStream("file.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
		objectOutputStream.writeObject(serializableObject);
		objectOutputStream.close();
		file.close();

	} catch (Exception e) {
		e.printStackTrace();
	}

//	Step 5 using Costructor Class
	try {
		Constructor<NewInstanceObject> constructor = NewInstanceObject.class.getDeclaredConstructor();
		NewInstanceObject newInstanceObject1 = constructor.newInstance();
		newInstanceObject.name = "Moshiur Rahman";
		System.out.println(newInstanceObject);
	} catch (NoSuchMethodException e) {
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		e.printStackTrace();
	} catch (InstantiationException e) {
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		e.printStackTrace();
	}


}
}
