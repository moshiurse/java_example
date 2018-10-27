package com.learn.java.oop.interfacedemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Moshiur on 10/28/2018.
 */
public class Player implements ISaveable{

	private String name;
	private int hitPoint;
	private int strength;
	private String weapon;

public Player(String name, int hitPoint, int strength) {
	this.name = name;
	this.hitPoint = hitPoint;
	this.strength = strength;
	this.weapon = "AK47";
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

public String getWeapon() {
	return weapon;
}

public void setWeapon(String weapon) {
	this.weapon = weapon;
}

@Override
public String toString() {
	return "Player{" +
			"name='" + name + '\'' +
			", hitPoint=" + hitPoint +
			", strength=" + strength +
			", weapon='" + weapon + '\'' +
			'}';
}

@Override
public List<String> write() {
	List<String> values = new ArrayList<>();
	values.add(0, this.name);
	values.add(1,"" + this.hitPoint);
	values.add(2, "" + this.strength);
	values.add(3, this.weapon);
	return values;
}

@Override
public void read(List<String> values) {

	if (values != null && values.size() > 0 ){
		this.name = values.get(0);
		this.hitPoint = Integer.parseInt(values.get(1));
		this.strength = Integer.parseInt(values.get(2));
		this.weapon = values.get(3);

	}

}
}
