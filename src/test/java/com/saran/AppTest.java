package com.saran;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.function.Supplier;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Going to follow TDD approach
 * I just wanted to add two numbers
 */
public class AppTest 
{
	@BeforeAll
	static void setUp() {
		System.out.println("B4 all is executed");
	}
	@AfterAll
	static void tearDown() {
		System.out.println("After all is executed");
	}
	@AfterEach
	 void tearDownThis() {
		System.out.println("After each is executed");
	}
	@BeforeEach
	 void setUpThis() {
		System.out.println("B4 each is executed");
	}
	@Test
	void add2Numbers() {
		Calculator c=new Calculator();		
		assertEquals(7,c.add(2,5));
		assertNotEquals(5,c.add(2, 5));
		Supplier<String> msg=()->"Calculator test failed";
		assertNotEquals(7,c.add(2, 5),msg);
		
	}
	
	@Test
	@Disabled
	void add2Number() {
		Calculator c=new Calculator();		
		assertEquals(7,c.add(2,5));
		
		
	}
   
}
