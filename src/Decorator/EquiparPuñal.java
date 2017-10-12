package Decorator;

import juego.Unidad;

public class EquiparPuñal extends UnidadEquipada {
	/**
	 * Variable estatica que indica el bonus de defensa que genera EquiparPuñal
	 */
	private static double BONUS_DEFENSA = 3;
	/**
	 * Variable estatica que indicael bonus de ataque que genera EquiparPuñal
	 */
	private static double BONUS_ATAQUE = 3;
	/**
	 * Decora una Unidad con un Puñal
	 * @param unidad
	 */
	public EquiparPuñal(Unidad unidad) {
		super(unidad);
	}
	/**
	 * Devuelve el valor del atributo Defensa restandole el bonus de defensa
	 */
	public double getDefensa() {
		return (super.getDefensa() - BONUS_DEFENSA);
	}
	/**
	 * Devuelve el valor del atributo Ataque sumandole el bonus de ataque 
	 */
	public double getAtaque() {
		return (super.getAtaque() + BONUS_ATAQUE);
	}
	/**
	 * Descuenta el daño recibido por parametro a la salud de la unidad decorada
	 */
	public void fueAtacado(double daño) {
		this.uni.fueAtacado(daño + BONUS_DEFENSA);
	}
}
