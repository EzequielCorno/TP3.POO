package juego;

public class Arquero extends Unidad {
	/*
	 * Energia incial del Arquero
	 */
	private final static int ENERGIA_BASE = 0;
	/**
	 * Defensa inicial del Arquero
	 */
	private final static int DEFENSA_BASE = 1;
	/**
	 * Salud inicial del Arquero
	 */
	private final static int SALUD_BASE = 50;
	/**
	 * Ataque basico del Arquero
	 */
	private final static int ATAQUE_BASE = 5;
	/**
	 * Distancia maxima en la cual el Arquero puede atacar
	 */
	private final static int DISTANCIA_MAXIMA = 5;
	/**
	 * Distancia minima en la cual el Arquero puede atacar
	 */
	private final static int DISTANCIA_MINIMA = 2;
	/**
	 * Cantidad de flechas inicial del Arquero
	 */
	private final static int CANTIDAD_DE_FLECHAS = 20;
	/**
	 * Inicializa un Arquero con sus valores iniciales
	 * @param posicion Donde se va a crear el Arquero
	 */
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
	/**
	 * Si posee flechas devuelve true y sino devuelve false
	 */
	@Override
	public boolean puedeRealizarAtaque() {
		return this.cantidadDeFlechas > 0;
	}
	/**
	 * Descuenta en uno la cantidad de flechas cuando ataca
	 */
	@Override
	public void realizarAtaque() {
		this.cantidadDeFlechas--;
	}
	/**
	 * Descuenta a la salud el daño recibido
	 */
	@Override
	public void fueAtacado(double daño) {
		this.salud -= (daño - defensa);
	}
	/**
	 * Recarga la cantidad de flechas siempre y cuando el Arquero este vivo
	 */
	public void recibirPaquete(){
		if(!this.estaMuerto())
			if(this.cantidadDeFlechas + 6 <= 20)
				 this.cantidadDeFlechas += 6;
	}
	
	

}
