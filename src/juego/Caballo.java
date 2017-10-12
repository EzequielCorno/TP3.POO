package juego;

public class Caballo {
	/**
	 * Estado en el que se encuentra el Caballo
	 */
	private Estado estado;
	/**
	 * Inicializa un Caballo con su estado inicial
	 */
	public Caballo(){
		estado = new Saludable();
	}
	/**
	 * Modifica el estado del caballo cuando consume agua
	 */
	public void consumirAgua(){
		estado = estado.consumirAgua();
	}
	/**
	 * Modifica el estado del caballo cuando ataca
	 */
	public void realizarAtaqueConCaballo(){
		estado = estado.realizarAtaqueConCaballo();
	}
	/**
	 * Obtiene el estado del Caballo
	 * @return 
	 */
	public Estado getEstado() {
		return estado;
	}

	
}
