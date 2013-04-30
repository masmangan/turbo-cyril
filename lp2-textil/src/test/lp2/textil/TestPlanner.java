package test.lp2.textil;

import static org.junit.Assert.*;
import lp2.textil.Box;
import lp2.textil.Planner;

import org.junit.Test;

/**
 * 
 * @author marco.mangan@gmail.com
 *
 */
public class TestPlanner {

	/**
	 * Um bloco de vinil com dimens�es 3 m x 5 m,
	 * sem nenhuma figura recortada, resulta em
	 * uma �rea de retalhos de 15 metros quadrados.
	 */
	@Test
	public void testEmpty() {
		Planner p = new Planner("vinil", 3, 5);
		double actual = p.getUnusedArea();
		double expected = 15;
		
		assertEquals(expected, actual, 0.01);
	}

	
	/**
	 * Um bloco de couro com dimens�es 4 m x 3 m,
	 * menos um ret�ngulo de 1 m x 1 m, resulta em
	 * uma �rea de retalhos de 11 metros quadrados.
	 */
	@Test
	public void testUnity() {
		Planner p = new Planner("couro", 4, 3);
		p.cut(new Box(1, 1));
		double actual = p.getUnusedArea();
		double expected = 11;
		
		assertEquals(expected, actual, 0.01);
	}
	
}
