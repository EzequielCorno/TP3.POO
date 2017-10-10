package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Decorator.EquiparCapa;
import Decorator.EquiparEscudo;
import Decorator.EquiparPuñal;
import Decorator.UnidadEquipada;
import juego.Arquero;
import juego.Caballero;
import juego.Lancero;
import juego.Punto;
import juego.Soldado;

public class TestBatallasItems {

	Arquero a1;
	Lancero l1;
	Soldado s1;
	Caballero c1;

	@Before
	public void setUp() throws Exception {
		a1 = new Arquero(new Punto(1, 1));
		l1 = new Lancero(new Punto(3, 3));
		s1 = new Soldado(new Punto(1, 1));
		c1 = new Caballero(new Punto(3, 3));
	}

	@Test
	public void SoldadoVsArqueroEscudo() {
		UnidadEquipada u1 = new EquiparEscudo(a1);
		s1.atacar(u1);
		Assert.assertEquals(47, u1.getSalud(), 0.1);
	}

	@Test
	public void SoldadoVsArqueroPuñal() {
		UnidadEquipada u1 = new EquiparPuñal(a1);
		s1.atacar(u1);
		Assert.assertEquals(38, u1.getSalud(), 0.1); // TENDRIA QUE DAR 40 (50 -
														// 10 + -2)
	}

	@Test
	public void SoldadoConCapaVsArquero() {
		UnidadEquipada u1 = new EquiparCapa(s1);
		u1.atacar(a1);
		Assert.assertEquals(42, a1.getSalud(), 0.1);
	}

	@Test
	public void SoldadoConPuñalVsArquero() {
		UnidadEquipada u1 = new EquiparPuñal(s1);
		u1.atacar(a1);

		Assert.assertEquals(38, a1.getSalud(), 0.1); // 50 - 13 +1
	}

	@Test
	public void SoldadoConPuñalVsArqueroEscudo() {
		UnidadEquipada u1 = new EquiparPuñal(s1);
		UnidadEquipada u2 = new EquiparEscudo(a1);
		u1.atacar(u2);

		Assert.assertEquals(45.8, u2.getSalud(), 0.1); // 50 - 13*0.4 +1
	}

	@Test
	public void SoldadoConPuñalYCapaVsArqueroEscudo() {
		UnidadEquipada u1 = new EquiparPuñal(new EquiparCapa(s1));
		UnidadEquipada u2 = new EquiparEscudo(a1);
		u1.atacar(u2);

		Assert.assertEquals(46.2, u2.getSalud(), 0.01); // 50 - 12*0.4 +1
														// INFLUYE EL ORDEN EN
														// QUE EQUIPAS
	}

	@Test
	public void SoldadoConPuñalYCapaVsArqueroEscudoYPuñal() {
		UnidadEquipada u1 = new EquiparPuñal(new EquiparCapa(s1));
		UnidadEquipada u2 = new EquiparEscudo(new EquiparPuñal(a1));
		u1.atacar(u2);

		Assert.assertEquals(43.2, u2.getSalud(), 0.01); // 50 - 12*0.4 + -2
														// INFLUYE EL ORDEN EN
														// QUE EQUIPAS
	}

	@Test
	public void SoldadoConPuñalYCapaYEscudoVsArqueroEscudoYPuñalYCapa() {
		UnidadEquipada u1 = new EquiparPuñal(new EquiparCapa(new EquiparEscudo(s1)));
		UnidadEquipada u2 = new EquiparEscudo(new EquiparPuñal(new EquiparCapa(a1)));
		u1.atacar(u2);

		Assert.assertEquals(43.2, u2.getSalud(), 0.01); // 50 - 12*0.4 + -2
														// INFLUYE EL ORDEN EN
														// QUE EQUIPAS
	}

	@Test
	public void SoldadoAtaca10VecesYConsumeAgua() {
		for (int i = 0; i < 10; i++) {
			s1.atacar(a1);
			a1.setSalud(50);
		}
		s1.consumirAgua();
		Assert.assertEquals(100, s1.getEnergia(), 0.1);
	}
	
	@Test
	public void SoldadoConCapaAtaca20VecesYConsumeAgua() {
		UnidadEquipada u1 = new EquiparCapa(s1);
		for (int i = 0; i < 20; i++) {
			u1.atacar(a1);
			a1.setSalud(50);
		}
		u1.consumirAgua();
		Assert.assertEquals(200, u1.getEnergia(), 0.1);
	}
	


}