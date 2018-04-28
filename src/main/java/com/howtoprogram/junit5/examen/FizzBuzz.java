package com.howtoprogram.junit5.examen;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Flowable;

public class FizzBuzz {

	public static String[] evaluateFizzBuzz(int max, int min) {
	
		List<Integer> numberList = new ArrayList<>();
		
		for(int i=min; i<=max; i++) {
			numberList.add(i);
		}
        Integer[] arr = (Integer[])numberList.toArray(new Integer[numberList.size()]);  
        String[] arrayReturn;
        arrayReturn = new String[arr.length];
        
        for(int j=0; j<arr.length; j++) {
        	if(arr[j]==0) {
        		arrayReturn[j]="0";
        	}
        		else {   
        			if(arr[j]%3==0 && arr[j]%5==0) {arrayReturn[j]="FIZZBUZZ";}
        				else {
        					if(arr[j]%3==0) {arrayReturn[j]="FIZZ";}
        						else {
        							if(arr[j]%5==0) {arrayReturn[j]="BUZZ";}
        								else {
        									arrayReturn[j]=String.valueOf(arr[j]);
        								}
        	
        						}
        				}
        	}
        	
        	}
        return arrayReturn;
		/*Flowable
			.fromArray(arr)
			.stream()
			.filter(x->{return x%2=0})
			.subscribe(x->{
				resultList.add(x);
				});*/
		
	}
	
}

