package juego;

public class Rebelde extends Estado{
	/**
	 * Atributo para llevar el conteo de la cantidad de agua que toma el caballo
	 */
	private int contadorAgua;
	/**
	 * Inicializa un Caballo Rebelde con sus valores iniciales
	 */
	public Rebelde(){
		contadorAgua=0;
	}
	/**
	 * Si consume agua devuelve un caballo Saludable
	 */
	@Override
	public Estado consumirAgua() {
		if(++contadorAgua == 1)
			return new Saludable();
		return this;
	}
	/**
	 * Devuelvo false porque un caballo rebelde no puede atacar
	 */
	@Override
	public boolean atacar() {
		return false;
	}

	@Override
	public Estado realizarAtaqueConCaballo() {
		return this;
	}

}
