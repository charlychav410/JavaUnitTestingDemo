package examentest;

import  com.howtoprogram.junit5.examen.FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;


public class FizzBuzzTest {
	
int max=15;
int min=1;
	
	@Test
	@DisplayName("shouldGreaterThanTen")
	void testFizzBuzz() {
		String [] listExpected =  {"1","2","FIZZ","4","BUZZ","FIZZ","7","8","FIZZ","BUZZ","11","FIZZ","13","14","FIZZBUZZ"};
		String [] result = FizzBuzz.evaluateFizzBuzz(max,min);
		assertArrayEquals(listExpected,result);
		
	}
	
	@Test
	@DisplayName("shouldEmptyGreaterThanTen")

	void shouldValidateEmptyArrayGreaterThanTen() {
		String [] listExpected =  {"0"};
		String [] result = FizzBuzz.evaluateFizzBuzz(0,0);
		assertArrayEquals(listExpected,result);
	}
	
}
