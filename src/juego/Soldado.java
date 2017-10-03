package juego;

public class Soldado extends Unidad {

	private final static int ENERGIA_BASE = 100;
	private final static int DEFENSA_BASE = 3;
	private final static int SALUD_BASE = 200;
	private final static int ATAQUE_BASE = 10;
	private final static int DISTANCIA_MAXIMA = 0;
	private final static int DISTANCIA_MINIMA = 0;
	private final static int ENERGIA_POR_ATAQUE = 10;; // Cuanto le consume cada ataque

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
	protected void consumirAgua() {
		energia = 100;
	}

	@Override
	protected boolean puedeRealizarAtaque() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void realizarAtaque() {
		this.energia -= ENERGIA_POR_ATAQUE;

	}

	@Override
	protected void fueAtacado(int daño) {
		this.salud -= (daño - this.defensa);
	}

}
