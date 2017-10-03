package juego;

public class Arquero extends Unidad {

	private final static int ENERGIA_BASE = 0;
	private final static int DEFENSA_BASE = 1;
	private final static int SALUD_BASE = 50;
	private final static int ATAQUE_BASE = 5;
	private final static int DISTANCIA_MAXIMA = 5;
	private final static int DISTANCIA_MINIMA = 2;
	private final static int CANTIDAD_DE_FLECHAS = 20;

	public Arquero(Punto posicion) {
		super(posicion);
		this.energia = ENERGIA_BASE;
		this.defensa = DEFENSA_BASE;
		this.salud = SALUD_BASE;
		this.ataque = ATAQUE_BASE;
		this.distanciaMinima = DISTANCIA_MINIMA;
		this.distanciaMaxima = DISTANCIA_MAXIMA;
		this.cantidadDeFlechas = CANTIDAD_DE_FLECHAS;
	}

	@Override
	protected void consumirAgua() {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean puedeRealizarAtaque() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void realizarAtaque() {
		this.cantidadDeFlechas--;
	}

	@Override
	protected void fueAtacado(int daño) {
		// TODO Auto-generated method stub

	}

}
