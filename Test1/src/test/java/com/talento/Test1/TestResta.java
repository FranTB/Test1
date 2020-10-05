package com.talento.Test1;

import junit.framework.TestCase;

public class TestResta extends TestCase{
	
	public void testRestar() {
		Resta resta = new Resta();
		double resultado = resta.restar(2.0, 1.0);
		assertEquals(1.0, resultado);
		
	}

}
