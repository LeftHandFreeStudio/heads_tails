package com.lefthandfreestudio.headsTails;


import static org.junit.Assert.*;
import org.junit.*;


/**
 * Unit test for simple App.
 */
public class AppTest{
	public static AnswerChecker checker;
	@BeforeClass
	public static void initVariables(){
		checker = new AnswerChecker();
	}
	@Test
	public void testValidAnswerChecking(){
		String answer2 = "yes";
		String answer3 = "no";
		String answer4 = "YeS";
		
		assertTrue(checker.checkWannaPlayAnswer(answer2));
		assertTrue(checker.checkWannaPlayAnswer(answer3));
		assertTrue(checker.checkWannaPlayAnswer(answer4));
	}
	@Test
	public void testFalseAnswerChecking(){
		String answer1 = "";
		String answer5 = "dsadaq";
		String answer6 = null;
		
		assertFalse(checker.checkWannaPlayAnswer(answer1));
		assertFalse(checker.checkWannaPlayAnswer(answer5));
		assertFalse(checker.checkWannaPlayAnswer(answer6));
		
	}
}
