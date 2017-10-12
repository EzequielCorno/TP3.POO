package juego;

public abstract class Estado {
	/**
	 * El caballo consume el agua
	 * @return Devuelve el estado actual del caballo
	 */
	public abstract Estado consumirAgua();
	/**
	 * Ataca y si el Caballero ataca 3 veces el caballo se pone rebelde
	 * @return Devuelve el estado actual del caballo
	 */
	public abstract Estado realizarAtaqueConCaballo();
	/**
	 * Pregunta si puede atacar
	 * @return Devuelve si puede o no atacar
	 */
	public abstract boolean atacar();
	/**
	 * Obtener el Estado del caballo
	 * @return Saludable o Rebelde
	 */
	public Estado getEstado(){
		return this;
	}
	
}
