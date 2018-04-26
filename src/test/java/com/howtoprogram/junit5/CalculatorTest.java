package com.howtoprogram.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.howtoprogram.junit5.Services.Election;
import com.howtoprogram.junit5.Services.IElection;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import Services.ElectionMock;
import static org.junit.Assert.assertEquals;

public class CalculatorTest{
	
	private Calculator calculator;
	 int a =0;
	 int b=9;
	 int expectedSuma =9 ;
	 int expectedResta =-9 ;
	 String expectedDiv ="0" ;
	 int expectedMul =0 ;
	 String mul= "false";
	 
	 
	 @Test
	void testGetDemoSuma() {
		System.out.println("Suma");
		calculator = new Calculator();
	  	assertEquals(expectedSuma, calculator.suma(a, b));

	 }
	
	@Test
	void testGetDemoResta() {
		System.out.println("Resta");
		calculator = new Calculator();
		assertEquals(expectedResta, calculator.resta(a, b));
	}
	
	@Test
	void sumaTestMockito() {
	Calculator calcu = mock(Calculator.class);
	when (calcu.suma(20, 20)).thenReturn(80);

	int sumaValue= calcu.suma(20, 20);
	assertEquals( 80, sumaValue);
	  System.out.println("Suma exitosa");
	}
	
	@Test
	void restaTestMockito() {
	Calculator calcu = mock(Calculator.class);
	when (calcu.resta(10, 5)).thenReturn(30);

	int restaValue= calcu.resta(10, 5);
	assertEquals( 30, restaValue);
	  System.out.println("Resta exitosa");
	}
	@Test
	void divTestMockito() {
	Calculator calcu = mock(Calculator.class);
	when (calcu.divi(10, 5)).thenReturn(100);

	int sumaValue= calcu.divi(10, 5);
	assertEquals( 100, sumaValue);
	  System.out.println("Division exitosa");
	}
	@Test
	void multiTestMockito() {
	Calculator calcu = mock(Calculator.class);
	when (calcu.multi(6, 10)).thenReturn(200);
	int sumaValue= calcu.multi(6, 10);
	assertEquals(  200, sumaValue);
	System.out.println("Multiplicacion exitosa");
	  
	  when (calcu.divi(10, 5)).thenReturn(100);

	  int divValue= calcu.divi(10, 5);
	  assertEquals( 100, divValue);
	  System.out.println("Division exitosa");
	
	
	}
	
	
	
	@Test
	void testGetDemoMul() {
		System.out.println("Multi");
		calculator = new Calculator();
		assertEquals(expectedMul, calculator.multi(a, b));

	}
	

	/*@Test
	void testGetDemoDiv() {
	  calculator = new Calculator();
	  if(b!=0) {
		    assertEquals(expectedDiv, calculator.divi(a, b));
		  System.out.println("Division exitosa");
	  	}
	  		else {
	  			assertEquals(mul, calculator.divi(a, b));
	  			System.out.println("Division entre cero");	
	  			}
  }*/
	
}