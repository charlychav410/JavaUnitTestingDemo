package com.howtoprogram.junit5.observablepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Observable;

public class DemoObservablesInteger {
	
	public static Integer[] getGreaterThanTen(Integer[] arrNumbers) {
	
		List<Integer> resultList = new ArrayList<>();
		
		          Flowable
						.fromArray(arrNumbers)
						.filter(x->x>10)
						.subscribe(x->{
							resultList.add(x);
							});
		
		          Integer[] arr = (Integer[])resultList.toArray(new Integer[resultList.size()]);  
		          
		return arr;
	}
	
	public static Integer[] duplicateNumbers(Integer[] arrNumbers) {
		List<Integer> resultList = new ArrayList<>();
	
	          Flowable
					.fromArray(arrNumbers)
					.map(x->(x*2))
					.toList()
					.subscribe(x->{
						resultList.addAll(x);
						});

	          Integer[] arr = (Integer[])resultList.toArray(new Integer[resultList.size()]);  

	    return arr;
	}
	
}
