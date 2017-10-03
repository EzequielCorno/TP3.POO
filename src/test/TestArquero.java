package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import juego.Arquero;
import juego.Punto;

public class TestArquero {

	Arquero a1;
	Arquero a2;
	
	@Before
	public void setUp() throws Exception {
		a1 = new Arquero(new Punto(1,1));
		a2 = new Arquero(new Punto(3,3));
	}

	@Test
	public void creaBienArquero() {
		
		Assert.assertTrue(a1.getAtaque() == 5);
		Assert.assertTrue(a1.getDefensa() == 1);
		Assert.assertTrue(a1.getSalud() == 50 );
		Assert.assertTrue(a1.getEnergia() == 0);
		Assert.assertTrue(a1.getCantidadDeFlechas() == 20);
		Assert.assertTrue(a1.getDistanciaMinima() == 2);
		Assert.assertTrue(a1.getDistanciaMaxima() == 5);
	}
	
	@Test 
	public void atacaBien(){
		Assert.assertEquals(true, a1.atacar(a2));
	}
	
	@Test
	public void evaluaSiEstaVivo(){
		Assert.assertTrue(a1.estaMuerto() == false);
	}
	
	@Test
	public void evaluaSiEstaMuerto(){
		while(a2.estaMuerto() == false){
			a1.atacar(a2);
		}
		Assert.assertEquals(true, a2.estaMuerto());
	}

}
