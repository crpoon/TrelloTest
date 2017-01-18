package com.crpoon.trellotest.TrelloTest.model;

public class Board {
	/*
	 * A Trello Board
	 * 
	 * Requires: name (length from 1 to 16384)
	 * Optional: desc, lists
	 * 
	 */
	
	private String id;
	private String name;
	private String desc;
	private java.util.List<List> lists;
	
	public Board(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public java.util.List<List> getLists() {
		return lists;
	}
	
	public void setCard(java.util.List<List> lists) {
		this.lists = lists;
	}
	
}
