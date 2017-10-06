package Decorator;

import juego.Punto;
import juego.Unidad;

public abstract class UnidadEquipada  extends Unidad{
	
	protected Unidad uni;
	
	public UnidadEquipada(Unidad unidad) {
		super(unidad);
		this.uni = unidad;		
	}
	
	@Override
	public void consumirAgua() {
		this.uni.consumirAgua();
		
	}

	@Override
	public boolean puedeRealizarAtaque() {
		return this.uni.puedeRealizarAtaque();
	}

	@Override
	public void realizarAtaque() {
		this.uni.realizarAtaque();
	}

	@Override
	public void fueAtacado(double daño) {
		this.uni.fueAtacado(daño);
		
	}
	
	public double getSalud(){
		return this.uni.getSalud();
	}
	
	public double getEnergia(){
		return this.uni.getEnergia();
	}
	
	public double getAtaque(){
		return this.uni.getAtaque();
	}
	
	public double getDefensa(){
		return this.uni.getDefensa();
	}
	
	public double getDistanciaMinima(){
		return this.uni.getDistanciaMinima();
	}
	
	public double getDistanciaMaxima(){
		return this.uni.getDistanciaMaxima();
	}
	
	public Punto getPosicion(){
		return this.uni.getPosicion();
	}
	
	public int getCantidadDeFlechas(){
		return this.uni.getCantidadDeFlechas();
	}
}
