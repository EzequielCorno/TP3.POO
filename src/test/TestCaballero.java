package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import juego.Caballero;
import juego.Caballo;
import juego.Punto;

public class TestCaballero {

	Caballero c1;
	Caballero c2;
	Caballo troya;
	
	@Before
	public void setUp() throws Exception {
		c1 = new Caballero(new Punto(1,1));
		c2 = new Caballero(new Punto(2,2));
	}

	@Test
	public void creaBienArquero() {
		
		Assert.assertTrue(c1.getAtaque() == 50);
		Assert.assertTrue(c1.getDefensa() == 4);
		Assert.assertTrue(c1.getSalud() == 200 );
		Assert.assertTrue(c1.getEnergia() == 0);
		Assert.assertTrue(c1.getDistanciaMinima() == 1);
		Assert.assertTrue(c1.getDistanciaMaxima() == 2);
	}
	
	@Test 
	public void atacaBien(){
		Assert.assertEquals(true, c1.atacar(c2));
	}
	
	@Test
	public void evaluaSiEstaVivo(){
		Assert.assertTrue(c1.estaMuerto() == false);
	}
	
	@Test
	public void evaluaSiEstaMuerto(){
		while(c2.estaMuerto() == false){
			c1.atacar(c2);
			c1.consumirAgua();
		}
		Assert.assertEquals(true, c2.estaMuerto());
	}
	
	@Test
	public void SeLePoneCaballoRebelde(){
		c1.atacar(c2);
		c1.atacar(c2);
		c1.atacar(c2);
		Assert.assertEquals(false, c1.atacar(c2));
	}
	
	@Test
	public void funcionaBienConsumirAgua(){
		c1.atacar(c2);
		c1.atacar(c2);
		c1.atacar(c2);
		c1.consumirAgua();
		Assert.assertEquals(true, c1.atacar(c2));
	}
}
