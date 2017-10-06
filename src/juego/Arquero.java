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
	public void consumirAgua() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean puedeRealizarAtaque() {
		return this.cantidadDeFlechas > 0;
	}

	@Override
	public void realizarAtaque() {
		this.cantidadDeFlechas--;
	}

	@Override
	public void fueAtacado(double daño) {
		this.salud -= (daño - defensa);
	}
	
	public void recibirPaquete(){
		if(!this.estaMuerto())
			if(this.cantidadDeFlechas + 6 <= 20)
				 this.cantidadDeFlechas += 6;
	}
	
	

}
