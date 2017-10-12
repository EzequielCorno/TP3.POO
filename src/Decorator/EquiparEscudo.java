package Decorator;

import juego.Unidad;

public class EquiparEscudo extends UnidadEquipada{
	/**
	 * Variable estatica que indica el bonus de defensa que genera EquiparEscudo
	 */
	private static double BONUS_DEFENSA = 0.4;
	/**
	 * Decora una Unidad con un Escudo
	 * @param unidad
	 */
	public EquiparEscudo(Unidad unidad) {
		super(unidad);
	}
	/**
	 * Descuenta el da�o recibido por parametro a la salud de la unidad decorada
	 */
	public void fueAtacado(double da�o){
		this.uni.fueAtacado(da�o * BONUS_DEFENSA);
	}

}
