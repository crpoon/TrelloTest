package com.crpoon.trellotest.TrelloTest.model;

public class Card {
	/*
	 * A Trello Card
	 * 
	 * Requires: idList (list id to add the card to)
	 * Optional: name, desc
	 * 
	 */
	
	private String id;
	private String idList;
	private String name;
	private String desc;
	
	public Card(String idList) {
		this.idList = idList;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getIdList() {
		return idList;
	}
	
	public void setIdList(String idList) {
		this.idList = idList;
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
}
