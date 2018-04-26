package com.howtoprogram.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BasicoDemoTest {
	
	private BasicDemo basicDemo;
	
	@BeforeAll
	static void setUpAll() {
		System.out.println("BeforeAll");
	}
	
	@BeforeEach
	void SetUp() {
		System.out.println("BeforeEach");

	}
	
	@AfterEach
	void tearDown() {
		System.out.println("AfterEach");

	}
	@AfterAll
	static void tearDownAll(){
		
		System.out.println("AfterAll");
		
	}

  @Test
  @DisplayName("PruebaDemo")
  
  void testGetDemoString() {
		System.out.println("PruebaDemo");
	  basicDemo = new BasicDemo();
    String expectedDemo = "Prueba";
    basicDemo.setDemoString(expectedDemo);
    assertEquals(expectedDemo, basicDemo.getDemoString());

  }
  @Test
  void SimpleTest() {
	  System.out.println("Test");
	  
  }


}
