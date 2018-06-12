package com.lefthandfreestudio.headsTails;
import java.util.Scanner;

public class HeadsTailsApp{
    public static void main( String[] args ) throws InterruptedException{
		AnswerChecker checker = new AnswerChecker();
		ScoreTracker tracker = new ScoreTracker();
		ResultGenerator rGenerator = new ResultGenerator();
		System.out.println("Do you want to play?");
		Scanner playerCommandsReader = new Scanner(System.in);
		String answer = playerCommandsReader.nextLine();
		if(checker.checkWannaPlayAnswer(answer)){
			answer = answer.toLowerCase();
			if(answer == "no"){
				System.out.println("Ok, bye then!");
			}else{
				tracker.startNewGame();
				System.out.println("Let's play!");
				System.out.println("Your current balance is : " + Integer.toString(tracker.getScore()));
				while(true){
					System.out.println("How much do you want to bet?");
					String betAmount = playerCommandsReader.nextLine();
					boolean validBet = checker.checkBetAmount(betAmount, tracker.getScore());
					if(validBet){
						boolean isWin = rGenerator.generateResult();
						System.out.println(" ");
						System.out.println("Coin is tossed...");
						Thread.sleep(1000);
						System.out.println("... and it's flying...");
						Thread.sleep(1000);
						System.out.println("... and flying...");
						Thread.sleep(500);
						System.out.println("... and felt!");
						Thread.sleep(500);
						System.out.println("Let's see the result!");
						System.out.println(" ");
						Thread.sleep(1500);
						int bet = Integer.parseInt(betAmount);
						if(isWin){
							tracker.increaseScore(bet);
							System.out.println("You won!");
							System.out.println("Your current balance is :" + Integer.toString(tracker.getScore()));
						}else{
							tracker.decreaseScore(bet);
							System.out.println("You lost!");
							System.out.println("Your current balance is :" + Integer.toString(tracker.getScore()));
							if(tracker.isGameLost()){
								System.out.println("You are out of money! Game Over!");
								break;
							}
						}
					}else{
						System.out.println("Invalid bet!");
					}
					Thread.sleep(1000);
				}
			}
		}else{
			System.out.println("Invalid answer!");
		}
    }
}
