package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import juego.Arquero;
import juego.Lancero;
import juego.Punto;
import juego.Soldado;
import juego.Caballero;

public class TestBatallas {

	Arquero a1;
	Lancero l1;
	Soldado s1;
	Caballero c1;
	
	@Before
	public void setUp() throws Exception {
		a1 = new Arquero(new Punto(1,1));
		l1 = new Lancero(new Punto(3,3));
		s1 = new Soldado(new Punto(1,1));
		c1 = new Caballero(new Punto (3,3));
	}
	
	@Test
	public void ArqueroVsLancero() {
		Assert.assertEquals(true, a1.atacar(l1));
	}
	
	@Test
	public void ArqueroVsSoldado() {
		Assert.assertEquals(false, a1.atacar(s1));
	}
    
	@Test
	public void ArqueroVsCaballero() {
		Assert.assertEquals(true, a1.atacar(l1));
	}
	
	@Test
	public void LanceroVsArquero() {
		Assert.assertEquals(true, l1.atacar(a1));
	}
	
	@Test
	public void LanceroVsSoldado() {
		Assert.assertEquals(true, l1.atacar(s1));
	}
	
	@Test
	public void LanceroVsCaballero() {
		Assert.assertEquals(false, l1.atacar(c1));
	}
	
	@Test
	public void SoldadoVsArquero() {
		Assert.assertEquals(true, s1.atacar(a1));
	}
	
	@Test
	public void SoldadoVsLancero() {
		Assert.assertEquals(false, s1.atacar(l1));
	}
	
	@Test
	public void SoldadoVsCaballero() {
		Assert.assertEquals(false, s1.atacar(c1));
	}
	
	@Test
	public void CaballeroVsArquero() {
		Assert.assertEquals(false, c1.atacar(a1));
	}
	
	@Test
	public void CaballeroVsLancero() {
		Assert.assertEquals(false, c1.atacar(l1));
	}
	
	@Test
	public void CaballeroVsSoldado() {
		Assert.assertEquals(false, c1.atacar(s1));
	}

}
