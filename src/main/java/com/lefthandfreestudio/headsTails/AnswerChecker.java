package com.lefthandfreestudio.headsTails;

public class AnswerChecker{
	
	public boolean checkWannaPlayAnswer(String answer){
		boolean isAnswerValid = false;
			if(answer != null && !answer.isEmpty()){
				answer = answer.toLowerCase();
				if(answer.equals("yes") || answer.equals("no")){
						isAnswerValid = true;
				};
			};
		return isAnswerValid;
	}
}