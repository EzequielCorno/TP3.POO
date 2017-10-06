package juego;

public class Lancero extends Unidad{

	private final static int ENERGIA_BASE = 0;
	private final static int DEFENSA_BASE = 2;
	private final static int SALUD_BASE = 150;
	private final static int ATAQUE_BASE = 25;
	private final static int DISTANCIA_MAXIMA = 3;
	private final static int DISTANCIA_MINIMA = 1;
	
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

	@Override
	public void fueAtacado(double daño) {
		this.salud -= (daño - this.defensa);		
	}

}
