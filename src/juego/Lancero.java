package juego;

public class Lancero extends Unidad{
	/**
	 * Energia inicial del Lancero
	 */
	private final static int ENERGIA_BASE = 0;
	/**
	 * Defensa inicial del Lancero
	 */
	private final static int DEFENSA_BASE = 2;
	/**
	 * Salud inicial del Lancero
	 */
	private final static int SALUD_BASE = 150;
	/**
	 * Ataque basico del Arquero
	 */
	private final static int ATAQUE_BASE = 25;
	/**
	 *  Distancia maxima en la que el Lancero puede atacar
	 */
	private final static int DISTANCIA_MAXIMA = 3;
	/**
	 *  Distancia minima en la que el Lancero puede atacar
	 */
	private final static int DISTANCIA_MINIMA = 1;
	/**
	 * Inicializa un Lancero con sus valores iniciales 
	 * @param posicion Donde se va a crear el Lancero
	 */
	public Lancero(Punto posicion) {
		super(posicion);
		this.energia = ENERGIA_BASE;
		this.defensa = DEFENSA_BASE;
		this.salud = SALUD_BASE;
		this.ataque = ATAQUE_BASE;
		this.distanciaMinima = DISTANCIA_MINIMA;
		this.distanciaMaxima = DISTANCIA_MAXIMA;
	}
	
	@Override
	public void consumirAgua() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean puedeRealizarAtaque() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void realizarAtaque() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Descuenta a la salud del Lancero el ataque de la unidad atacante
	 */
	@Override
	public void fueAtacado(double daño) {
		this.salud -= (daño - this.defensa);		
	}

}
