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
	public int getScore(){
		return score;
	}
}