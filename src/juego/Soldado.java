package juego;

public class Soldado extends Unidad {

	private final static int ENERGIA_BASE = 100;
	private final static int DEFENSA_BASE = 3;
	private final static int SALUD_BASE = 200;
	private final static int ATAQUE_BASE = 10;
	private final static int DISTANCIA_MAXIMA = 0;
	private final static int DISTANCIA_MINIMA = 0;
	private final static int ENERGIA_POR_ATAQUE = 10;; // CUANTO LE CONSUME CADA ATAQUE

	public Soldado(Punto posicion) {
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
		energia = getEnergiaMaxima();
	}

	@Override
	public boolean puedeRealizarAtaque() {
		return this.energia >= 10;
	}

	@Override
	public void realizarAtaque() {
		this.energia = getEnergia() - ENERGIA_POR_ATAQUE;

	}

	@Override
	public void fueAtacado(double daño) {
		this.salud -= (daño - this.defensa);
	}


}
