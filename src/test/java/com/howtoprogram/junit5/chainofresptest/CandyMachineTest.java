package com.howtoprogram.junit5.chainofresptest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.howtoprogram.junit5.chainofresp.GansitoImpl;
import com.howtoprogram.junit5.chainofresp.ICandyMachine;
import com.howtoprogram.junit5.chainofresp.LollipopImpl;
import com.howtoprogram.junit5.chainofresp.NitoImpl;
import com.howtoprogram.junit5.chainofresp.ProductsMachine;

public class CandyMachineTest {
	@Test
	void validateCAncyMachineTest() {
	
		ICandyMachine c1=new GansitoImpl();
		ICandyMachine c2=new NitoImpl();
		ICandyMachine c3=new LollipopImpl();
		
		c1.setNextChain(c2);
		c2.setNextChain(c3);
		
		
		ProductsMachine productsMachine = new ProductsMachine();
		productsMachine.setMoney(1119);
		c1.dispense( productsMachine);
		System.out.println(String.format("Gansitos: %d", productsMachine.getGansitos()));
		System.out.println(String.format("Nitos: %d", productsMachine.getNitos()));
		System.out.println(String.format("Paletas: %d", productsMachine.getPaletas()));
		System.out.println(String.format("Money: %f", productsMachine.getMoney()));

		assertEquals(50, productsMachine.getGansitos());
		assertEquals(1, productsMachine.getNitos());
		assertEquals(8, productsMachine.getPaletas());
		assertEquals(0, productsMachine.getMoney());


	}

}
