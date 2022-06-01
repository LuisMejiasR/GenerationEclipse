package com.generation.f20220601.pruebasUnitarias;

public class Calculadora {
	
	public int suma(int numero1, int numero2) {
		return numero1 + numero2;
	}
	public int resta(int numero1, int numero2) {
		return numero1 - numero2;
	}
	public int multiplicacion(int numero1, int numero2) {
		return numero1 * numero2;
	}
	public String divison(int numero1, int numero2) {
		if (numero2 != 0) {
			String resultado = Integer.toString(numero1 / numero2);
			return resultado;
		}
		
		return "No se puede dividir por cero";
	}
	
	//crear metodos para un valor de entrada, saber si es:
	//numero par
	//numero impar
	public String numerosPares(int numero){
        if(numero % 2 == 0){
            String resultado = "Tu numero es par";
            return resultado;
        }        
        return "tu numero es Impar";
    }

	
}
