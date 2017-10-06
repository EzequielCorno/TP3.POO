package Decorator;

import juego.Unidad;

public class EquiparEscudo extends UnidadEquipada{

	private double bonusDefensa;
	
	public EquiparEscudo(Unidad unidad) {
		super(unidad);
		this.bonusDefensa = 0.6;
	}
	
	public void fueAtacado(double da�o){
		this.uni.fueAtacado(da�o * bonusDefensa);
	}

}
