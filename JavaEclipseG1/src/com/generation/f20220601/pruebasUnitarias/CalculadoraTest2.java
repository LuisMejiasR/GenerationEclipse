package com.generation.f20220601.pruebasUnitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest2 {
	
	//buscar todos los assert que nos ofrece junit

	@Test
	public void testSuma() {
		Calculadora calcSum = new Calculadora();
		int resultadoSum = calcSum.suma(12, 42);
		
		//assertEquales(valorEsperado, resultado)
		assertEquals(54, resultadoSum);
	}
	

	@Test
	public void testResta() {
		Calculadora calcResta = new Calculadora();
		int resultadoResta = calcResta.resta(2, 0);
		
		//assertTrue(resultadoResta < -1);
	}

	@Test
	public void testMultiplicacion() {
		Calculadora calcMul = new Calculadora();
		int resultadoMul = calcMul.multiplicacion(5, 5);
		
		//assertNotSame(calcMul, calcMul);
	}

	@Test
	public void testDivison() {
		Calculadora calcDiv = new Calculadora();
		String resultadoDiv = calcDiv.divison(12, 6);
		
		assertEquals("2", resultadoDiv);
		//assertEquals("No se puede dividir por cero", resultadoDiv);
		assertNotNull(resultadoDiv);
		assertNotEquals("0", resultadoDiv);
		
		
	}
	
	@Test
	public void testNumeroPar() {
		Calculadora calcPar = new Calculadora();
		String resultadoPar = calcPar.numerosPares(2);
		
		assertEquals("Tu numero es par", resultadoPar);
		
		
	}
	
	@Test
	public void testNumeroImpar() {
		Calculadora calcImpar = new Calculadora();
		String resultadoImpar = calcImpar.numerosPares(3);
		
		assertEquals("tu numero es Impar", resultadoImpar);
		
		
	}

}
