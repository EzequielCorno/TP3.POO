package test;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import juego.Punto;
import juego.Soldado;
import juego.Unidad;


public class TestSoldado {

	@Test
	public void creaBienSoldado() {
		Soldado s1 = new Soldado(new Punto(1,1));
		Assert.assertTrue(s1.getAtaque() == 10);
		Assert.assertTrue(s1.getDefensa() == 3);
		Assert.assertTrue(s1.getSalud() == 200 );
		Assert.assertTrue(s1.getEnergia() == 100);
	}
	
	@Test 
	public void atacaBien(){
		Soldado s1 = new Soldado(new Punto(1,1));
		Soldado s2 = new Soldado(new Punto(1,1));
		Assert.assertEquals(true, s1.atacar(s2));
	}
	
	@Test
	public void evaluaSiEstaVivo(){
		Soldado s1 = new Soldado(new Punto(1,1));
		Assert.assertTrue(s1.estaMuerto() == false);
	}
	
	@Test
	public void evaluaSiEstaMuerto(){
		Soldado s1 = new Soldado(new Punto(1,1));
		Soldado s2 = new Soldado(new Punto(1,1));
		while(s2.estaMuerto() == false){
			s1.atacar(s2);
			s1.consumirAgua();
		}
		Assert.assertEquals(true, s2.estaMuerto());
	}

}
