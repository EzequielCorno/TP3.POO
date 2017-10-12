package Decorator;

import juego.Unidad;

public class EquiparPu�al extends UnidadEquipada {
	/**
	 * Variable estatica que indica el bonus de defensa que genera EquiparPu�al
	 */
	private static double BONUS_DEFENSA = 3;
	/**
	 * Variable estatica que indicael bonus de ataque que genera EquiparPu�al
	 */
	private static double BONUS_ATAQUE = 3;
	/**
	 * Decora una Unidad con un Pu�al
	 * @param unidad
	 */
	public EquiparPu�al(Unidad unidad) {
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
	 * Descuenta el da�o recibido por parametro a la salud de la unidad decorada
	 */
	public void fueAtacado(double da�o) {
		this.uni.fueAtacado(da�o + BONUS_DEFENSA);
	}
}
