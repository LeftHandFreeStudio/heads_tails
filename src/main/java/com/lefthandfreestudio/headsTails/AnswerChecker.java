package com.lefthandfreestudio.headsTails;
public class AnswerChecker{
	
	public boolean checkWannaPlayAnswer(String answer){
		boolean isAnswerValid = true;
			if(answer == null || answer == ""){
				isAnswerValid = false;
			};
			answer = answer.toLowerCase();
			if(answer != "yes"){
				if(answer != "no"){
					isAnswerValid = false;
				};
			};
		return isAnswerValid;
	}
}