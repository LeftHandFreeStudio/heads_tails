package com.lefthandfreestudio.headsTails;
import java.util.Scanner;

public class HeadsTailsApp{
    public static void main( String[] args ) throws InterruptedException{
		AnswerChecker checker = new AnswerChecker();
		ScoreTracker tracker = new ScoreTracker();
		System.out.println("Do you want to play?");
		Scanner playerCommandsReader = new Scanner(System.in);
		String answer = playerCommandsReader.nextLine();
		if(checker.checkWannaPlayAnswer(answer)){
			answer = answer.toLowerCase();
			if(answer == "no"){
				System.out.println("Ok, bye then!");
			}else{
				System.out.println("Let's play! How much do you want to bet?");
				while(true){
					String betAmount = playerCommandsReader.nextLine();
					Thread.sleep(1000);
				}
			}
		}else{
			System.out.println("Invalid answer!");
		}
    }
}
