package com.example.calculadoraspring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculadoraspringApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void somar() {
		Calculadora calc = new Calculadora();
		int resultad = calc.somar(10, 10);

		assertEquals(20, resultad); 
	}
	@Test
	void subtrair() {
		Calculadora calc = new Calculadora();
		int resultad = calc.subtrair(10, 10);

		assertEquals(0, resultad); 
	}
	@Test
	void multiplicar() {
		Calculadora calc = new Calculadora();
		int resultad = calc.multiplicar(10, 10);

		assertEquals(100, resultad); 
	}
	@Test
	void dividir() {
		Calculadora calc = new Calculadora();
		int resultad = calc.dividir(10, 10);

		assertEquals(1, resultad); 
	}
}
