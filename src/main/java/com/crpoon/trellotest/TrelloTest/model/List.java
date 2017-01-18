package com.crpoon.trellotest.TrelloTest.model;

import java.util.ArrayList;

public class List {
	/*
	 * A Trello List
	 * 
	 * Requires: name (length 1 to 16384), boardId
	 * Optional: cards (contains all the cards)
	 * 
	 */
	
	private String id;
	private String name;
	private String boardId;
	private java.util.List<Card> cards;
	
	public List(String name, String boardId) {
		this.name = name;
		this.boardId = boardId;
		this.cards = new ArrayList<>();
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
	
	public String getBoardId() {
		return boardId;
	}
	
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	
	public java.util.List<Card> getCards() {
		return cards;
	}
	
	public void setCard(java.util.List<Card> cards) {
		this.cards = cards;
	}
}
