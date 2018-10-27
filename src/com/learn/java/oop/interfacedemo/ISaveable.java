package com.learn.java.oop.interfacedemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Moshiur on 10/28/2018.
 */
public interface ISaveable {
	List<String> write();

	void read(List<String> values);
}
