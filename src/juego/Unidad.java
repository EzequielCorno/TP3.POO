package juego;

/**
 * La clase abstracta Unidad engloba las características comunes a todas las
 * unidades. <br>
 */

public abstract class Unidad {

	protected final static int CANT_MAX_ITEM = 3;

	/**
	 * Ataque inicial de la unidad.
	 */
	protected int ataque;

	/**
	 * Salud inicial de la unidad.
	 */
	protected int salud;

	/**
	 * Energia inicial de la unidad.
	 */
	protected int energia;

	protected int energiaMaxima;

	protected double distanciaMinima;

	protected double distanciaMaxima;
	
	protected int cantidadDeFlechas;
	
	protected double defensa;
	
	protected int energiaPorAtaque;

	protected Punto posicion;

	// protected ArrayList<Item> items;

	public Unidad(Punto posicion) {
		this.posicion = posicion;
	}

	protected abstract void consumirAgua();

	protected abstract boolean puedeRealizarAtaque();

	protected abstract void realizarAtaque();

	protected abstract void fueAtacado(int daño);

	protected boolean puedeAtacar(Unidad obj){
		if(this.estaMuerto() || obj.estaMuerto())
			return false;
		
		double distancia = this.posicion.distanciaCon(obj.posicion);
		
		if(distancia >= this.distanciaMinima && distancia <= this.distanciaMaxima && 
				this.puedeRealizarAtaque())
			return true;
		
		return false;
	}
	
	protected boolean atacar(Unidad obj){
		
		if(this.puedeAtacar(obj)){
			this.realizarAtaque();
			obj.fueAtacado(this.ataque);
			//obj.fueAtacado(this.ataque - this.ataque*getCapa())
			return true;
		}
		
		return false;
		
	}

	protected boolean estaMuerto() {

		return this.salud == 0;

	}

}
