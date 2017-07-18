/**
* Represents a single card. The class has two properties Face and Suit. The 
* values are set at the time of instatiation and cannot be changed afterwards.
* There are gettes for both properties, but no setters as the properties are
* read only.
*/
package com.github.preethisuresh84.cards;

public class Card {
	private String face;
	private String suit;
	
	public Card(String face,String suit){
		this.face = face;
		this.suit = suit;
	}
	
	 String getFace(){
		 return face;
	}
	
	String getSuit(){
		return suit;
	}
	
	public String toString(){
		return suit + " of " + face;

	}
}
