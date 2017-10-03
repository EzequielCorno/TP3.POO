package juego;

public class Lancero extends Unidad{

	private int energia_base;
	private int defensa_base;
	private int salud_base;
	private int ataque_base;
	private int distancia_maxima;
	private int distancia_minima;
	
	public Lancero(Punto posicion) {
		super(posicion);
		energia_base = 0 ;
		defensa_base = 2;
		salud_base = 150;
		ataque_base = 25;
		distancia_minima = 1;
		distancia_maxima = 3;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void fueAtacado(int daño) {
		// TODO Auto-generated method stub
		
	}

}
