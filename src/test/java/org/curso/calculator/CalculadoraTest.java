package org.curso.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class CalculadoraTest {

	double resultadoEsperado = 0;
	double unNumero = 0;
	double otroNumero = 0;
	double divisor = 0;
		
	@Before
	public void inicializar() {
		unNumero = 10;
		otroNumero = 20;
		divisor = 2;
	}
		
	@After
	public void finaliza() {
		resultadoEsperado = 0;
	}
	
	//1. El resultado de multiplicar 80 por 3 da 240
	@Test
	public void dadosDosNumeros_probarMultiplicacion() {
		assertEquals(240, Calculadora.multiplicar(80, 3));
	}
	
	@Test
	public void dadosDosNumeros_verificarLaSumaConDivision() {
		resultadoEsperado = Calculadora.dividir(Calculadora.sumar(unNumero,otroNumero), divisor);
		assertEquals(resultadoEsperado,15);
	}
	
	@Test
	public void dadosDosNumeros_verificarLaRestaConMultiplicacion() {
		resultadoEsperado = Calculadora.multiplicar(Calculadora.restar(otroNumero, unNumero), otroNumero);
		assertEquals(200, resultadoEsperado);
	}
	
	//2. El resultado de sumar 150 y 180, dividido por 3, da 110
	
	
	//3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.
	
	
	//4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.

	
	
}
