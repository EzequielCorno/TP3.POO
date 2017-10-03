package juego;

public class Arquero extends Unidad{
	
	private int energia_base;
	private int defensa_base;
	private int salud_base;
	private int ataque_base;
	private int distancia_maxima;
	private int distancia_minima;
	private int cantidad_flechas;
	
	public Arquero(Punto posicion) {
		super(posicion);
		energia_base = 0 ;
		defensa_base = 1;
		salud_base = 50;
		ataque_base = 5;
		distancia_minima = 2;
		distancia_maxima = 5;
		cantidad_flechas = 20;
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
