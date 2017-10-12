package juego;

public class Caballero extends Unidad {
	/**
	 *Energia inicial del Caballero
	 */
	private final static int ENERGIA_BASE = 0;
	/**
	 * Defensa incial del Caballero
	 */
	private final static int DEFENSA_BASE = 4;
	/**
	 * Salud inicial del Caballero
	 */
	private final static int SALUD_BASE = 200;
	/**
	 * Ataque basico del Caballero
	 */
	private final static int ATAQUE_BASE = 50;
	/**
	 *  Distancia maxima en la que el Caballero puede atacar
	 */
	private final static int DISTANCIA_MAXIMA = 2;
	/**
	 *  Distancia minima en la que el Caballero puede atacar
	 */
	private final static int DISTANCIA_MINIMA = 1;
	/**
	 * Caballo del Caballero
	 */
	private Caballo caballo;
	/**
	 * Inicializa un Caballero con sus valores inciales
	 * @param posicion Donde se va a crear el Caballero
	 */
	public Caballero(Punto posicion) {
		super(posicion);
		this.energia = ENERGIA_BASE;
		this.defensa = DEFENSA_BASE;
		this.salud = SALUD_BASE;
		this.ataque = ATAQUE_BASE;
		this.distanciaMinima = DISTANCIA_MINIMA;
		this.distanciaMaxima = DISTANCIA_MAXIMA;
		this.caballo = new Caballo();

	}
	/**
	 * Si el caballo esta rebelde lo tranquiliza
	 */
	@Override
	public void consumirAgua() {
		if (!this.estaMuerto())
			caballo.consumirAgua();
	}
	/**
	 * Si el caballo no esta rebelde devuelve true y sino devuelve false
	 */
	@Override
	public boolean puedeRealizarAtaque() {
		return this.caballo.getEstado().atacar() ;
	}
	/**
	 *Realiza el ataque y a los 3 ataques el caballo se pone rebelde
	 */
	@Override
	public void realizarAtaque() {
		this.caballo.realizarAtaqueConCaballo();
	}
	/**
	 * Descuenta a la salud del Caballero el ataque de la unidad atacante
	 */
	@Override
	public void fueAtacado(double daño) {
		this.salud -= (daño - this.defensa);
	}

}
