package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import juego.Arquero;
import juego.Lancero;
import juego.Punto;

public class TestBatallas {

	Arquero a1;
	Lancero l1;
	
	@Before
	public void setUp() throws Exception {
		a1 = new Arquero(new Punto(1,1));
		l1 = new Lancero(new Punto(3,3));
	}
	
	@Test
	public void ArqueroVsLancero() {
		Assert.assertEquals(true, a1.atacar(l1));
	}
	
	@Test
	public void LanceroVsArquero() {
		Assert.assertEquals(true, l1.atacar(a1));
	}

	
	

}
