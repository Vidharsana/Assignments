package com.mphasis.MphasisProj05;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    
    @Test
    public void sayHelloTest() {
    	String expected="Hello";
    	String actual=new App().sayHello();
    	assertEquals(expected, actual);
    }
    
    public void checkTextTest() {
    	assertNull(new App().checkText());
    }
    
    
    @BeforeAll
	public static void BeforeEveryTest() {
		System.out.println("Testing of API started");
	}
    
    
    @AfterEach
    public void afterEach() {
		System.out.println("Testing of API completed");
	}
}
