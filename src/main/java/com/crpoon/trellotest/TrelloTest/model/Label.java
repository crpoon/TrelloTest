package com.crpoon.trellotest.TrelloTest.model;

public class Label {
	/*
	 * A Trello Card Label
	 * 
	 * Requires: color (which can be a color or null)
	 * Optional: name
	 * 
	 */
	
	private String id;
	private String color;
	private String name;
	
	public Label(String color) {
		this.color = color;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
