package juego;

public class Soldado extends Unidad {
	/**
	 * Energia inicial del Soldado
	 */
	private final static int ENERGIA_BASE = 100;
	/**
	 * Defensa inicial del Soldado
	 */
	private final static int DEFENSA_BASE = 3;
	/**
	 * Salud inicial del Soldado
	 */
	private final static int SALUD_BASE = 200;
	/**
	 * Ataque basico del Soldado
	 */
	private final static int ATAQUE_BASE = 10;
	/**
	 * Distancia maxima en la que el Soldado puede atacar
	 */
	private final static int DISTANCIA_MAXIMA = 0;
	/**
	 * Distancia minima en la que el Soldado puede atacar
	 */
	private final static int DISTANCIA_MINIMA = 0;
	/**
	 * Energia que se descuenta cada vez que el Soldado ataca 
	 */
	private final static int ENERGIA_POR_ATAQUE = 10;
	/**
	 * Inicializa un Soldado con sus valores iniciales
	 * @param posicion Donde se va a crear el Soldado
	 */
	public Soldado(Punto posicion) {
		super(posicion);
		this.energia = ENERGIA_BASE;
		this.defensa = DEFENSA_BASE;
		this.salud = SALUD_BASE;
		this.ataque = ATAQUE_BASE;
		this.distanciaMinima = DISTANCIA_MINIMA;
		this.distanciaMaxima = DISTANCIA_MAXIMA;
	}
	/**
	 * Restaura toda la energia
	 */
	@Override
	public void consumirAgua() {
		energia = getEnergiaMaxima();
	}
	/**
	 * Si posee energia para atacar devuelve true y sino devuelve false
	 */
	@Override
	public boolean puedeRealizarAtaque() {
		return this.energia >= 10;
	}
	/**
	 * Descuenta a la energia del Soldado la energia por ataque
	 */
	@Override
	public void realizarAtaque() {
		this.energia = getEnergia() - ENERGIA_POR_ATAQUE;

	}
	/**
	 * Descuenta a la salud del Soldado el ataque de la unidad atacante
	 */
	@Override
	public void fueAtacado(double daño) {
		this.salud -= (daño - this.defensa);
	}


}
