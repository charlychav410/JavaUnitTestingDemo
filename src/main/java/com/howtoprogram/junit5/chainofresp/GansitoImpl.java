package com.howtoprogram.junit5.chainofresp;

public class GansitoImpl extends ICandyMachine {

	private ICandyMachine chain;
	int price = 22;
	@Override
	public void setNextChain(ICandyMachine nextChain) {
		this.chain=nextChain;
	}

	/* (non-Javadoc)
	 * @see com.howtoprogram.junit5.chainofresp.ICandyMachine#dispense(double)
	 */
	/*@Override
	
	
	public void dispense(int gansitos=0, double price=22, ProductsMachine productsMachine) {
		
		/*int gansitos=0;
		double money=productsMachine.getMoney();
		while(money >= this.price) {
			money -=this.price;
			gansitos++;
		}*/
	
		@Override
	public	void dispense(ProductsMachine productsMachine) {
		int gansitos=returnProducts( productsMachine, price);
		
		productsMachine.setGansitos(gansitos);
		
			if(chain !=null) {
				chain.dispense( productsMachine);
			}
			
		}
	}
	

