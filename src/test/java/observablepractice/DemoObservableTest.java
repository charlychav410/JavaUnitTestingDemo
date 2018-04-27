package observablepractice;

import  com.howtoprogram.junit5.observablepractice.DemoObservables;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;

public class DemoObservableTest {
	int[] arrNumbers = {1,5,10,20}; 
	
	@Test
	@DisplayName("shouldGreaterThanTen")
	void shouldGreaterThanTen() {
		int [] listExpected =  {20};
		int [] result = DemoObservables.getGreaterThanTen(arrNumbers);
		assertArrayEquals(listExpected,result);
		
	}
	
	@Test
	@DisplayName("shouldDuplicate")

	void shouldValidateEmptyArrayGreaterThanTen() {
		int [] listExpected =  {};
		int [] testList = {};
		int [] result = DemoObservables.getGreaterThanTen(testList);
		assertArrayEquals(listExpected,result);
	}
	
	@Test
	@DisplayName("shouldDuplicate")

	void shouldDuplicate() {
		int [] listExpected =  {2,10,20,40};
		int [] result = DemoObservables.duplicateNumbers(arrNumbers);
		assertArrayEquals(listExpected,result);
	}

	@Test
	@DisplayName("shouldDuplicateEmptyArray")

	void shouldValidateEmptyArrayDuplicate() {
		int [] listExpected =  {};
		int [] testList = {};
		int [] result = DemoObservables.duplicateNumbers(testList);
		assertArrayEquals(listExpected,result);
	}
}
