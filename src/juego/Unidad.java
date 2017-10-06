package juego;

import java.util.ArrayList;
import Decorator.UnidadEquipada;

public abstract class Unidad {

	protected final static int CANT_MAX_ITEM = 3;

	/**
	 * Ataque inicial de la unidad.
	 */
	protected double ataque;

	/**
	 * Salud inicial de la unidad.
	 */
	protected double salud;

	/**
	 * Energia inicial de la unidad.
	 */
	protected double energia;

	protected double energiaMaxima;

	protected double distanciaMinima;

	protected double distanciaMaxima;
	
	protected int cantidadDeFlechas;
	
	protected double defensa;
	
	protected Punto posicion;

	protected ArrayList<UnidadEquipada> arrayItem;


	public Unidad(Punto posicion) {
		this.posicion = posicion;
	}
	
	public Unidad(Unidad unidad){
		this.ataque = unidad.getAtaque();
		this.defensa = unidad.getDefensa();
		this.energia = unidad.getEnergia();
		this.salud = unidad.getSalud();
		this.distanciaMaxima = unidad.getDistanciaMaxima();
		this.distanciaMinima = unidad.getDistanciaMinima();
		this.posicion = unidad.getPosicion();
	}

	public abstract void consumirAgua();

	public abstract boolean puedeRealizarAtaque();

	public abstract void realizarAtaque();

	public abstract void fueAtacado(double da�o);

	public boolean puedeAtacar(Unidad obj){
		if(this.estaMuerto() || obj.estaMuerto())
			return false;
		
		double distancia = this.posicion.distanciaCon(obj.posicion);
		
		if(distancia >= this.distanciaMinima && distancia <= this.distanciaMaxima && this.puedeRealizarAtaque())
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

		return this.salud <= 0;

	}

	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}

	public double getSalud() {
		return salud;
	}

	public void setSalud(double salud) {
		this.salud = salud;
	}

	public double getEnergia() {
		return energia;
	}

	public void setEnergia(double energia) {
		this.energia = energia;
	}

	public double getDefensa() {
		return defensa;
	}

	public void setDefensa(double defensa) {
		this.defensa = defensa;
	}

	public double getDistanciaMinima() {
		return distanciaMinima;
	}

	public double getDistanciaMaxima() {
		return distanciaMaxima;
	}

	public int getCantidadDeFlechas() {
		return cantidadDeFlechas;
	}

	public Punto getPosicion() {
		return posicion;
	}
	
	/*public void equiparCapa(DecoratorItem obj) {
		if(this.puedeEquiparItem(obj)) {
			this.arrayItem.add(obj);
			this.ataque -= ( this.ataque * obj.getBonusFuerza() );
			this.energia *= obj.getBonusEnergia();
		}
	}
	
	public void equiparPu�al(DecoratorItem obj) {
		if(this.puedeEquiparItem(obj)) {
			this.arrayItem.add(obj);
			this.ataque += obj.getBonusFuerza();
			this.defensa += obj.getBonusDefensa();
		}
	}
	
	public void equiparEscudo(DecoratorItem obj) {
		if(this.puedeEquiparItem(obj)){
			this.arrayItem.add(obj);
			
		}
	}
	
	private boolean puedeEquiparItem(DecoratorItem obj) {
		for(DecoratorItem it : this.arrayItem) {
		if(it.getClass() == obj.getClass())
			return false;
		}
		return true;
	}
*/
	
}
