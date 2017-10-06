package test;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Decorator.EquiparCapa;
import Decorator.EquiparEscudo;
import Decorator.EquiparPuñal;
//import Decorator.Capa;
import Decorator.UnidadEquipada;
import juego.Arquero;
import juego.Punto;
import juego.Unidad;

public class TestArquero {

	Arquero a1;
	Arquero a2;
	
	@Before
	public void setUp() throws Exception {
		a1 = new Arquero(new Punto(1,1));
		a2 = new Arquero(new Punto(2,3));
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
		Assert.assertEquals(46, a2.getSalud(),0.1);
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

	@Test
	public void equipaBienUnaCapa() {
		UnidadEquipada u1 = new EquiparCapa(a1);
		Assert.assertEquals(4.5, u1.getAtaque(), 0.1);
		
	}
	
	@Test
	public void equipaBienPuñal(){
		UnidadEquipada u1 = new EquiparPuñal(a1);
		Assert.assertEquals(8.0, u1.getAtaque(),0.1);		
	}
	
	@Test
	public void equipaBienEscudo(){
		UnidadEquipada u1 = new EquiparEscudo(a1);
		a2.atacar(u1);
		Assert.assertEquals(48, u1.getSalud(),0.1);
	}
}
