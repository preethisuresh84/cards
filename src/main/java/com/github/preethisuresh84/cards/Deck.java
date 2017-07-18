/**
* Represents a deck of cards. The class stores 52 cards in an array and 
* provides methods to shuffle and deal cards.
*/

package com.github.preethisuresh84.cards;
import java.util.Random;
 
public class Deck {

	Card[] cards = new Card[52];
	Random random = new Random();
	
	public Deck(){
		
		setCardArray();
	}

	/**
	* Initialize the card array.
	* @return void.
	*/
	private void setCardArray(){
		String[] faces = new String[]{"Hearts","Spades","Clubs",
			"Diamonds"};
		String[] suits = new String[]{"Ace","2","3","4","5","6",
			"7","8","9",
			"10","Jack​","Queen​","King​"};
		int index = 0;
		
		for(String face: faces){
			for(String suit: suits){
				Card card = new Card(face, suit);
				cards[index] = card;
				index++;
			}
		}
	}
	/**
	* shuffle the deck to a random order.
	* @return void.
	*/
	public void shuffle(){ 
		for(int i = cards.length-1; i >= 0; i--){
			int tempIndex = random.nextInt(i+1);
			Card tempCard = cards[tempIndex];
			cards[tempIndex] = cards[i];
			cards[i] = tempCard;
		}
	}
	/**
	* deal a card. if no card index, then return a random card from the deck.
	* @return Card.
	* @param int index of the card to deal, if not supplied return a card at 
	* random.
	*/
	public Card dealOneCard(int index){
		if(index < 52 && index > 0) return cards[index];
		return cards[random.nextInt(52)];
    	}
	
	public static void main(String[] args) {	
		Deck deck = new Deck();
		Card c = deck.dealOneCard(10);
		System.out.println(c);
		deck.shuffle();
		c = deck.dealOneCard(10);
		System.out.println(c);
		
	}
	

}
