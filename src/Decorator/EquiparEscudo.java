package Decorator;

import juego.Unidad;

public class EquiparEscudo extends UnidadEquipada{

	private static double BONUS_DEFENSA = 0.4;
	
	public EquiparEscudo(Unidad unidad) {
		super(unidad);
	}
	
	public void fueAtacado(double da�o){
		this.uni.fueAtacado(da�o * BONUS_DEFENSA);
	}

}
