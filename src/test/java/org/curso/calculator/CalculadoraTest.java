package org.curso.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

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
	@Test
	public void resultadoDeLaSuma_DivididoTres()
	{
		unNumero = 150;
		otroNumero = 180;
		resultadoEsperado = Calculadora.dividir(Calculadora.sumar(unNumero,otroNumero),3);
		assertEquals(110, resultadoEsperado);
	}
		
	//3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.
	@Test
	public void laMultiplicacionDeLaResta()
	{
		unNumero = 90;
		otroNumero = 50;
		resultadoEsperado = Calculadora.multiplicar(Calculadora.restar(unNumero,otroNumero),15);
		//Ponemos .0 para que java infiera que el tipo de dato es double
		assertNotEquals(resultadoEsperado,605);
	}
		
	//4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.
	@Test
	public void laSumaYMultiplicacion()
	{
		unNumero = 70;
		otroNumero = 40;
		resultadoEsperado = Calculadora.multiplicar(Calculadora.sumar(unNumero,otroNumero),25);
		//Ponemos .0 para que java infiera que el tipo de dato es double
		assertNotEquals(2700.0,resultadoEsperado);
	}
	
	
}
