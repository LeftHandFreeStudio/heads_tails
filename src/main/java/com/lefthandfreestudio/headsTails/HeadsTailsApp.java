package com.lefthandfreestudio.headsTails;
import java.util.Scanner;

public class HeadsTailsApp{
    public static void main( String[] args ){
		System.out.println("Do you want to play?");
		Scanner playerCommandsReader = new Scanner(System.in);
		String answer = playerCommandsReader.nextLine();
		System.out.println(answer);
    }
}
