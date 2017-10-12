package Decorator;

import juego.Punto;
import juego.Unidad;

public abstract class UnidadEquipada  extends Unidad{
	/**
	 * Atributo de clase
	 */
	protected Unidad uni;
	/**
	 * Decora una Unidad
	 * @param unidad
	 */
	public UnidadEquipada(Unidad unidad) {
		super(unidad);
		this.uni = unidad;		
	}
	/**
	 * Dependiendo de la unidad realiza una accion distinta
	 */
	@Override
	public void consumirAgua() {
		this.uni.consumirAgua();
		
	}
	/**
	 * Dependiendo de la unidad realiza una validacion distinta 
	 */
	@Override
	public boolean puedeRealizarAtaque() {
		return this.uni.puedeRealizarAtaque();
	}
	/**
	 * Dependiendo de la unidad realiza cambios en los atributos de la unidad decorada
	 */
	@Override
	public void realizarAtaque() {
		this.uni.realizarAtaque();
	}
	/**
	 * Descuenta el daño recibido por parametro a la salud de la unidad decorada
	 */
	@Override
	public void fueAtacado(double daño) {
		this.uni.fueAtacado(daño);
		
	}
	/**
	 * Devuelve el valor del atributo Salud de la unidad decorada
	 */
	public double getSalud(){
		return this.uni.getSalud();
	}
	/**
	 * Devuelve el valor del atributo Energia de la unidad decorada
	 */
	public double getEnergia(){
		return this.uni.getEnergia();
	}
	/**
	 * Devuelve el valor del atributo Ataque de la unidad decorada
	 */
	public double getAtaque(){
		return this.uni.getAtaque();
	}
	/**
	 * Devuelve el valor del atributo Defensa de la unidad decorada
	 */
	public double getDefensa(){
		return this.uni.getDefensa();
	}
	/**
	 * Devuelve el valor del atributo distanciaMinima de la unidad decorada
	 */
	public double getDistanciaMinima(){
		return this.uni.getDistanciaMinima();
	}
	/**
	 * Devuelve el valor del atributo distaciaMaxima de la unidad decorada
	 */
	public double getDistanciaMaxima(){
		return this.uni.getDistanciaMaxima();
	}
	/**
	 * Devuelve la posicion de la unidad decorada
	 */
	public Punto getPosicion(){
		return this.uni.getPosicion();
	}
	/**
	 * Devuelve la cantidad de flechas de la unidad decorada
	 */
	public int getCantidadDeFlechas(){
		return this.uni.getCantidadDeFlechas();
	}
}
