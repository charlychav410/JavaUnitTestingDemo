package com.howtoprogram.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicDemoTest {
private BasicDemo basicDemo;
	

	void testGetDemoString() {
		System.out.println("PruebaDemo");
	  basicDemo = new BasicDemo();
    String expectedDemo = "Prueba";
    basicDemo.setDemoString(expectedDemo);
    assertEquals(expectedDemo, basicDemo.getDemoString());

  }


}


