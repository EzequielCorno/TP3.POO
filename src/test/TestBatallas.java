package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Decorator.EquiparEscudo;
import Decorator.UnidadEquipada;
import juego.Arquero;
import juego.Lancero;
import juego.Punto;
import juego.Soldado;

public class TestBatallas {

	Arquero a1;
	Lancero l1;
	Soldado s1;
	
	@Before
	public void setUp() throws Exception {
		a1 = new Arquero(new Punto(1,1));
		l1 = new Lancero(new Punto(3,3));
		s1 = new Soldado(new Punto(1,1));
	}
	
	@Test
	public void ArqueroVsLancero() {
		Assert.assertEquals(true, a1.atacar(l1));
	}
	
	@Test
	public void LanceroVsArquero() {
		Assert.assertEquals(true, l1.atacar(a1));
	}

	@Test
	public void ArqueroVsSoldado(){
		UnidadEquipada u1 = new EquiparEscudo(a1);
		s1.atacar(u1);
		Assert.assertEquals(46,u1.getSalud(),0.1);
	}
	

}
