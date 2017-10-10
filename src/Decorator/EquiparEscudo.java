package Decorator;

import juego.Unidad;

public class EquiparEscudo extends UnidadEquipada{

	private static double BONUS_DEFENSA = 0.4;
	
	public EquiparEscudo(Unidad unidad) {
		super(unidad);
	}
	
	public void fueAtacado(double daño){
		this.uni.fueAtacado(daño * BONUS_DEFENSA);
	}

}
