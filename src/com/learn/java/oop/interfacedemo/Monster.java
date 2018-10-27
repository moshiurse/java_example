package com.learn.java.oop.interfacedemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Moshiur on 10/28/2018.
 */
public class Monster implements ISaveable{
	private String name;
	private int hitPoint;
	private int strength;

public Monster(String name, int hitPoint, int strength) {
	this.name = name;
	this.hitPoint = hitPoint;
	this.strength = strength;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getHitPoint() {
	return hitPoint;
}

public void setHitPoint(int hitPoint) {
	this.hitPoint = hitPoint;
}

public int getStrength() {
	return strength;
}

public void setStrength(int strength) {
	this.strength = strength;
}


@Override
public List<String> write() {
	List<String> values = new ArrayList<>();
	values.add(0, this.name);
	values.add(1,"" + this.hitPoint);
	values.add(2, "" + this.strength);
	return values;
}

@Override
public void read(List<String> values) {

	if (values != null && values.size() > 0 ){
		this.name = values.get(0);
		this.hitPoint = Integer.parseInt(values.get(1));
		this.strength = Integer.parseInt(values.get(2));
	}

}


@Override
public String toString() {
	return "Monster{" +
			"name='" + name + '\'' +
			", hitPoint=" + hitPoint +
			", strength=" + strength +
			'}';
}


}
