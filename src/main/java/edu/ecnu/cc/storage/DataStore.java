package edu.ecnu.cc.storage;

import java.util.ArrayList;

public class DataStore {
	private ArrayList<Element> store;
	private int size;
	
	public DataStore(int size) {
		this.size = size;
		this.store = new ArrayList<Element>();
	}
	
	public boolean insert(int key, String value) {
		boolean result = true;
		if (key >= size) {
			result = false;
		} else {
			if (store.get(key) == null) {
				store.add(key, new Element(key, value));
			} else {
				store.get(key).setValue(value);
			}
		}
		return result;
	}
	
	public String getValue(int key) {
		if (store.get(key) == null) {
			return null;
		} else {
			return store.get(key).getValue();
		}
	}
	
	public Element getElement(int key) {
		return store.get(key);
	}
}
