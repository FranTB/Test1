package com.talento.Test1;

import junit.framework.TestCase;

public class TestSuma extends TestCase{
	
	public void testSumar() {
		
		Suma suma = new Suma();
		double resultado = suma.sumar(1.0, 1.0);
		//Este metodo que compara el valor obtenido 
		//por el metodo sumar y el valor real, esperado
		assertEquals(2.0, resultado);
		
	}
	
	public void testDuplicar() {
		Suma suma = new Suma();
		double resultado = suma.duplicar(1.0);
		assertEquals(2.0, resultado);
	}

}
