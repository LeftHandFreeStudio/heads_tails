package com.lefthandfreestudio.headsTails;

import java.util.Random;

public class ResultGenerator{
	private Random r = new Random();
	
	public boolean generateResult(){
		boolean isWin = false;
		int result = r.nextInt(100);
		if(result <= 50){
			isWin = true;
		}
		return isWin;
	}
}