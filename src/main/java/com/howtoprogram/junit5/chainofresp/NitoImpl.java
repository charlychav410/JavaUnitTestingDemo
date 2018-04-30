package com.howtoprogram.junit5.chainofresp;

public class NitoImpl extends ICandyMachine{

	private ICandyMachine chain;
	private int price=11;

	@Override
	public void setNextChain(ICandyMachine nextChain) {
		// TODO Auto-generated method stub
		this.chain=nextChain;
	}

	
		@Override
	public void dispense(ProductsMachine productsMachine) {
		int nitos=returnProducts( productsMachine, price);
		productsMachine.setNitos(nitos);
		
		if(chain !=null) {
			chain.dispense( productsMachine);
		}
		
	}

	

}
