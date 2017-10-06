package Decorator;

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
}
