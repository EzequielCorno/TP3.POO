package juego;

import java.util.ArrayList;
import Decorator.DecoratorItem;

public abstract class Unidad {

	protected final static int CANT_MAX_ITEM = 3;

	/**
	 * Ataque inicial de la unidad.
	 */
	protected int ataque;

	/**
	 * Salud inicial de la unidad.
	 */
	protected int salud;

	/**
	 * Energia inicial de la unidad.
	 */
	protected int energia;

	protected int energiaMaxima;

	protected double distanciaMinima;

	protected double distanciaMaxima;
	
	protected int cantidadDeFlechas;
	
	protected double defensa;
	
	protected Punto posicion;

	protected ArrayList<DecoratorItem> items;

	public Unidad(Punto posicion) {
		this.posicion = posicion;
	}

	public abstract void consumirAgua();

	public abstract boolean puedeRealizarAtaque();

	public abstract void realizarAtaque();

	public abstract void fueAtacado(int daño);

	public boolean puedeAtacar(Unidad obj){
		if(this.estaMuerto() || obj.estaMuerto())
			return false;
		
		double distancia = this.posicion.distanciaCon(obj.posicion);
		
		if(distancia >= this.distanciaMinima && distancia <= this.distanciaMaxima && 
				this.puedeRealizarAtaque())
			return true;
		
		return false;
	}
	
	public boolean atacar(Unidad obj){
		
		if(this.puedeAtacar(obj)){
			this.realizarAtaque();
			obj.fueAtacado(this.ataque);
			//obj.fueAtacado(this.ataque - this.ataque*getCapa())
			return true;
		}
		
		return false;
		
	}

	public boolean estaMuerto() {

		return this.salud == 0;

	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public double getDefensa() {
		return defensa;
	}

	public void setDefensa(double defensa) {
		this.defensa = defensa;
	}

	
}
