package juego;

public class Soldado extends Unidad{

	private int energia_base;
	private int defensa_base;
	private int salud_base;
	private int ataque_base;
	private int distancia_maxima;
	private int distancia_minima;
	private int energia_por_ataque; //Cuanto le consume cada ataque
	
	public Soldado(Punto posicion) {
		super(posicion);
		energia_base = 100 ;
		defensa_base = 3;
		salud_base = 200;
		ataque_base = 10;
		distancia_minima = 0;
		distancia_maxima = 0;
		energia_por_ataque = 10;
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
