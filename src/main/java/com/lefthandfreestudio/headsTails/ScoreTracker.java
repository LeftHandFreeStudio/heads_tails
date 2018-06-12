package com.lefthandfreestudio.headsTails;

public class ScoreTracker{
	private int score = 0;
	public void startNewGame(){
		score = 100;
	}
	public void increaseScore(int bet){
		score += bet;
	}
	public void decreaseScore(int bet){
		score -= bet;
	}
	public boolean isGameLost(){
		return score <= 0;
	}
	public int getScore(){
		return score;
	}
}