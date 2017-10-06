package Decorator;

import juego.Unidad;

public class EquiparEscudo extends UnidadEquipada{

	private double bonusDefensa;
	
	public EquiparEscudo(Unidad unidad) {
		super(unidad);
		this.bonusDefensa = 1.4;
	}
	
	public double getDefensa(){
		return super.defensa * bonusDefensa;
	}

}
