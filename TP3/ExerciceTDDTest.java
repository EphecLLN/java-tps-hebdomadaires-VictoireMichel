package TP3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExerciceTDDTest {

	@Test
	void test() {
		ExerciceTDD exo = new ExerciceTDD();
		assertEquals(true, exo.estPair(2));
		assertEquals(8, exo.perimetreCarre(2));
		assertEquals(1, exo.estDedans('c', "poc"));
	}

}
