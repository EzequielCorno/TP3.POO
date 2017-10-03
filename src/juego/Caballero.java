package juego;

public class Caballero extends Unidad {

	private final static int ENERGIA_BASE = 0;
	private final static int DEFENSA_BASE = 4;
	private final static int SALUD_BASE = 200;
	private final static int ATAQUE_BASE = 50;
	private final static int DISTANCIA_MAXIMA = 1;
	private final static int DISTANCIA_MINIMA = 2;
	private final static int CABALLO_REBELDE = 0; // si llega a 3 esta rebelde

	public Caballero(Punto posicion) {
		super(posicion);
		this.energia = ENERGIA_BASE;
		this.defensa = DEFENSA_BASE;
		this.salud = SALUD_BASE;
		this.ataque = ATAQUE_BASE;
		this.distanciaMinima = DISTANCIA_MINIMA;
		this.distanciaMaxima = DISTANCIA_MAXIMA;
		this.caballoRebelde = CABALLO_REBELDE;

	}

	@Override
	protected void consumirAgua() {
		caballoRebelde = 0;
	}

	@Override
	protected boolean puedeRealizarAtaque() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void realizarAtaque() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void fueAtacado(int daño) {
		// TODO Auto-generated method stub

	}

}
