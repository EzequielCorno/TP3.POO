package juego;

public class Caballero extends Unidad {

	private final static int ENERGIA_BASE = 0;
	private final static int DEFENSA_BASE = 4;
	private final static int SALUD_BASE = 200;
	private final static int ATAQUE_BASE = 50;
	private final static int DISTANCIA_MAXIMA = 2;
	private final static int DISTANCIA_MINIMA = 1;
	private Caballo caballo; //------------- SI LLEGA A 3 ESTA REBELDE

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

	@Override
	public void consumirAgua() {
		if (!this.estaMuerto())
			caballo.consumirAgua();
	}

	@Override
	public boolean puedeRealizarAtaque() {
		return this.caballo.getEstado().atacar() ;
	}

	@Override
	public void realizarAtaque() {
		this.caballo.realizarAtaqueConCaballo();
	}

	@Override
	public void fueAtacado(double daño) {
		this.salud -= (daño - this.defensa);
	}

}
