package com.generation.f20220601.pruebasUnitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void test() {
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12, 42);
		
		//assertEquales(valorEsperado, resultado)
		assertEquals(54, resultado);
	}
	
	@Test
	public void testDivision() {
		Calculadora calc = new Calculadora();
		String resultado = calc.divison(0, 0);
		
		assertNotNull(resultado);
	}

}
