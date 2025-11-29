package com.mphasis.MphasisProj05;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	
	@Test
	public void addTest() {
		int expected=10;
    	int actual=new Calculator().add(5, 5);
    	assertEquals(expected, actual);
	}
	
	@Test
	public void subTest() {
		int expected=0;
    	int actual=new Calculator().sub(5, 5);
    	assertEquals(expected, actual);
	}
	
	@Test
	public void mulTest() {
		int expected=25;
    	int actual=new Calculator().mul(5, 5);
    	assertEquals(expected, actual);
	}
	
	@Test
	public void divTest() {
		int expected=1;
    	int actual=new Calculator().div(5, 5);
    	assertEquals(expected, actual);
	}
	
	@Test
	public void isEvenTest() {
		assertTrue(new Calculator().isEven(4),"for input 4 result must be true");
	}
	
	@Test
	public void checkArraysTest() {
		int brr[]= {1,2,3,4,5};
		assertArrayEquals(brr, new Calculator().checkArrays());
//		assertSame(brr, new Calculator().checkArrays());
	}
	
	public void checkAETet() {
		ArithmeticException ex=new ArithmeticException();
		assertTrue(new Calculator().checkAE() instanceof ArithmeticException);
	}
	
	@BeforeEach
	public void BeforeEveryTest() {
		System.out.println("Testing of API started");
	}

	@AfterAll
	public static void afterEach() {
		System.out.println("Testing of API completed");
	}
}
