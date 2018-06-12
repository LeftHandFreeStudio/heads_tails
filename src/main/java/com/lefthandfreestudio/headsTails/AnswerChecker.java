package com.lefthandfreestudio.headsTails;

public class AnswerChecker{
	
	public boolean checkWannaPlayAnswer(String answer){
		boolean isAnswerValid = false;
			if(answer != null && !answer.isEmpty()){
				answer = answer.toLowerCase();
				if(answer.equals("yes") || answer.equals("no")){
						isAnswerValid = true;
				}
			}
		return isAnswerValid;
	}
	public boolean checkBetAmount(String answer, int currentScore){
		boolean isBetValid = true;
		int bet;
			try{
				bet = Integer.parseInt(answer);
			}catch(Exception e){
				isBetValid = false;
				return isBetValid;
			}
		if(isBetValid && (bet <= 0 || bet > currentScore)){
				isBetValid = false;
				return isBetValid;
		}
		return isBetValid;
	}
}