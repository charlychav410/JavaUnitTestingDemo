package com.howtoprogram.junit5.chainofresp;

public class LollipopImpl extends ICandyMachine{

	public ICandyMachine chain;
	public int price=1;

	@Override
	public void setNextChain(ICandyMachine nextChain) {
		// TODO Auto-generated method stub
		this.chain=nextChain;
	}

	@Override
	public void dispense(ProductsMachine productsMachine) {
	int paletas= returnProducts( productsMachine, price);
	productsMachine.setPaletas(paletas);
	if(chain !=null) {
		chain.dispense( productsMachine);
	}
	
}

}
