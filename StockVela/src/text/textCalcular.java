package text;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import codigo.CalculoAlmacen;

public class textCalcular {
CalculoAlmacen calcu = new CalculoAlmacen();
	@Before
	public void setUp() throws Exception {
		calcu.anyadirLlantaAlmacen2(0);
	}

	@Test
	public void test() {
		assertEquals(1,calcu.calcularTotalAlmacen2());
	
	}

}
