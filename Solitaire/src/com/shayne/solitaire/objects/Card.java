package com.shayne.solitaire.objects;

import com.shayne.solitaire.constants.Rank;
import com.shayne.solitaire.constants.Suit;

public class Card {
	private Rank rank;
	private Suit suit;
	private String color;
	public boolean isFaceUp;

	public Card() {

	}

	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public String getColor() {
		return color;
	}

	public boolean isFaceUp() {
		return isFaceUp;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public void setColor() {
		if (suit.getSuitName().equals("D") && suit.getSuitName().equals("H")) {
			this.color = "red";
		} else {
			this.color = "black";
		}
	}

	public void setFaceUp(boolean isFaceUp) {
		this.isFaceUp = isFaceUp;
	}

	@Override
	public String toString() {

		if (isFaceUp) {
			return "[" + this.suit + "-" + this.rank + "]";
		} else {
			return "[X-X]";
		}
	}
}
