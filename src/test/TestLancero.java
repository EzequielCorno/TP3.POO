package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import juego.Lancero;
import juego.Punto;

public class TestLancero {

	Lancero l1;
	Lancero l2;
	
	@Before
	public void setUp() throws Exception {
		l1 = new Lancero(new Punto(1,1));
		l2 = new Lancero(new Punto(3,3));
	}

	@Test
	public void creaBienArquero() {
		
		Assert.assertTrue(l1.getAtaque() == 25);
		Assert.assertTrue(l1.getDefensa() == 2);
		Assert.assertTrue(l1.getSalud() == 150 );
		Assert.assertTrue(l1.getEnergia() == 0);
		Assert.assertTrue(l1.getDistanciaMinima() == 1);
		Assert.assertTrue(l1.getDistanciaMaxima() == 3);
	}
	
	@Test 
	public void atacaBien(){
		Assert.assertEquals(true, l1.atacar(l2));
	}
	
	@Test
	public void evaluaSiEstaVivo(){
		Assert.assertTrue(l1.estaMuerto() == false);
	}
	
	@Test
	public void evaluaSiEstaMuerto(){
		while(l2.estaMuerto() == false){
			l1.atacar(l2);
		}
		Assert.assertEquals(true, l2.estaMuerto());
	}

}
