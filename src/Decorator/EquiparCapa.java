package Decorator;

import juego.Unidad;

public class EquiparCapa extends UnidadEquipada{
	/**
	 * Variable estatica que indica el bonus de fuerza que genera EquiparCapa
	 */
	private static final double BONUS_FUERZA = 0.9;
	/**
	 * Variable estatica que indica el bonus de energia que genera EquiparCapa
	 */
	private static final double BONUS_ENERGIA = 2;
	/**
	 * Variable estatica que indica la energia maxima de una Unidad con Capa
	 */
	private static final double ENERGIA_MAXIMA = 200;
	/**
	 * 	Decora una Unidad con una Capa
	 * @param unidad
	 */
	public EquiparCapa(Unidad unidad) {
		super(unidad);
	}
	/**
	 * Devuelve el valor del atributo Ataque de una Unidad con Capa
	 */
	public double getAtaque(){
		return super.getAtaque() * BONUS_FUERZA;
	}
	/**
	 * Devuelve el valor del atributo Energia de una Unidad con Capa
	 */
	public double getEnergia(){
		return super.getEnergia() * BONUS_ENERGIA;
	}
	/**
	 * Descuenta el daño recibido por parametro a la salud de la unidad decorada
	 */
	public void fueAtacado(double daño) {
		this.uni.fueAtacado(daño);
	}
	/**
	 * Devuelve el valor de la energia maxima de una Unidad con Capa
	 */
	public  double getEnergiaMaxima() {
		return ENERGIA_MAXIMA;
	}
}
