package org.lessons.java.calculator.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	static Calculator c;

	@BeforeAll
	static void setUpBeforeClass() {
		c = new Calculator();
	}

	@Test
	@DisplayName("Somma numeri")
	void testSomma() {
		float somma = c.add(2, 3);
		assertEquals(5, somma, "Il risultato deve essere 5");
	}

	@Test
	@DisplayName("Sottrazione numeri")
	void testSottrazione() {
		float sottrazione = c.substract(3, 2);
		assertEquals(1, sottrazione, "Il risultato deve essere 1");
	}

	@Test
	@DisplayName("Divisione numeri")
	void testDivisione() {
		float divisione = c.divide(6, 3);
		assertEquals(2, divisione, "Il risultato deve essere 2");
	}

	@Test
	@DisplayName("Moltiplicazione numeri")
	void testMoltiplicazione() {
		float Moltiplicazione = c.multiply(2, 3);
		assertEquals(6, Moltiplicazione, "Il risultato deve essere 6");
	}

}
