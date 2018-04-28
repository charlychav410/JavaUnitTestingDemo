package observablepractice;

import  com.howtoprogram.junit5.observablepractice.DemoObservablesInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;

public class DemoObservableIntegerTest {
	
	Integer[] arrNumbers = {1,5,10,20}; 
	
	
	@Test
	@DisplayName("shouldGreaterThanTen")
	void shouldGreaterThanTen() {
		Integer [] listExpected =  {20};
		Integer [] result = DemoObservablesInteger.getGreaterThanTen(arrNumbers);
		assertArrayEquals(listExpected,result);
		
	}
	
	@Test
	@DisplayName("shouldEmptyGreaterThanTen")

	void shouldValidateEmptyArrayGreaterThanTen() {
		Integer [] listExpected =  {};
		Integer [] testList = {};
		Integer [] result = DemoObservablesInteger.getGreaterThanTen(testList);
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("shouldDuplicate")

	void shouldDuplicate() {
		Integer [] listExpected =  {2,10,20,40};
		Integer [] result = DemoObservablesInteger.duplicateNumbers(arrNumbers);
		assertArrayEquals(listExpected,result);
	}

	@Test
	@DisplayName("shouldDuplicateEmptyArray")

	void shouldValidateEmptyArrayDuplicate() {
		Integer [] listExpected =  {};
		Integer [] testList = {};
		Integer [] result = DemoObservablesInteger.duplicateNumbers(testList);
		assertArrayEquals(listExpected,result);
	}
}
