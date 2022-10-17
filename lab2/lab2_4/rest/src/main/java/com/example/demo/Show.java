package com.example.demo;

public class Show {
 
	private int id; 
	private String name;

	public Show(int id, String name) { 
		this.name = name;
		this.id = id;
	}

	 
	public String getName() {
		return this.name;
	}

	public int getId() { 
		return this.id;
	}

}