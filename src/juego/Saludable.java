package juego;

public class Saludable extends Estado{
	/**
	 * Atributo para llevar el conteo de ataques que realiza el Caballero
	 */
	private int cantAtaques;
	/**
	 * Inicializa un caballo saludable con sus valores iniciales
	 */
	public Saludable(){
		cantAtaques=0;
	}
	
	@Override
	public Estado consumirAgua() {
		return this;
	}
	/**
	 * Devuelve true porque siempre un caballo saludable pueded atacar
	 */
	public boolean atacar(){
		return true;
	}
	/**
	 * Si el caballero ataca 3 veces el estado del caballo cambia a Rebelde
	 */
	@Override
	public Estado realizarAtaqueConCaballo() {
		if(++cantAtaques == 3)
			return new Rebelde();
		return this;
	}

}
