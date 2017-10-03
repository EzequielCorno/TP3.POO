package juego;

public class Lancero extends Unidad{

	private final static int ENERGIA_BASE = 0;
	private final static int DEFENSA_BASE = 2;
	private final static int SALUD_BASE = 150;
	private final static int ATAQUE_BASE = 25;
	private final static int DISTANCIA_MAXIMA = 1;
	private final static int DISTANCIA_MINIMA = 3;
	
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
	protected void consumirAgua() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean puedeRealizarAtaque() {
		// TODO Auto-generated method stub
		return true;
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
