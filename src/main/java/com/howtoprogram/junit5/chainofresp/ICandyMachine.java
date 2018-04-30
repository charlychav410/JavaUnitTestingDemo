package com.howtoprogram.junit5.chainofresp;

public abstract class ICandyMachine {
	
public abstract void setNextChain(ICandyMachine nextChain); 
	
public abstract void dispense(ProductsMachine productsMachine);
		
	int returnProducts(ProductsMachine productsMachine, int price) {
		int product=0;
		double money=productsMachine.getMoney();
		while(money >= price) {
			money -=price;
			product++;	
			}
		productsMachine.setMoney(money);
		return product;
	
	}
	
	
	
}