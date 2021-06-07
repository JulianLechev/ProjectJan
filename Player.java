package encaraMessi;

import java.util.ArrayList;

public class Player {
	
	
	private ArrayList<String> hand = new ArrayList<String>();
	private int handScore = 0;
	private int place = 0;
	boolean isAI = false;
	boolean isReady = false;
	
	public Player() {
	}

public Player(String name){
	
	
}

	public  ArrayList<String> getHand() {
		return hand;
	}
	
	public void giveCard(String card){
		hand.add(card);
	}



	public void setHand( ArrayList<String> hand) {
		this.hand = hand;
	}



	public int getPlace() {
		return place;
	}



	public void setPlace(int place) {
		this.place = place;
	}



	public int getHandScore() {
		return handScore;
	}



	public void setHandScore(int handScore) {
		this.handScore = handScore;
	}
	
	
}