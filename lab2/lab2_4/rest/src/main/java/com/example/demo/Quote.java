package com.example.demo;

public class Quote {
 
	private String content;
	private int show;

	public Quote(String content, int show) { 
		this.content = content;
		this.show = show;
	}

	 
	public String getContent() {
		return content;
	}

	public int getShow() { 
		return show;
	}

}