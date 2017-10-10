package juego;

public abstract class Unidad {

	protected final static double ENERGIA_MAXIMA = 100;


	/**
	 * Ataque inicial de la unidad.
	 */
	protected double ataque;

	/**
	 * Salud inicial de la unidad.
	 */
	protected double salud;

	/**
	 * Energia inicial de la unidad.
	 */
	protected double energia;

	protected double energiaMaxima;

	protected double distanciaMinima;

	protected double distanciaMaxima;
	
	protected int cantidadDeFlechas;
	
	protected double defensa;
	
	protected Punto posicion;
	
	public Unidad(Punto posicion) {
		this.posicion = posicion;
	}
	
	public Unidad(Unidad unidad){
		this.ataque = unidad.getAtaque();
		this.defensa = unidad.getDefensa();
		this.energia = unidad.getEnergia();
		this.salud = unidad.getSalud();
		this.distanciaMaxima = unidad.getDistanciaMaxima();
		this.distanciaMinima = unidad.getDistanciaMinima();
		this.posicion = unidad.getPosicion();
	}

	public abstract void consumirAgua();

	public abstract boolean puedeRealizarAtaque();

	public abstract void realizarAtaque();

	public abstract void fueAtacado(double daño);

	public boolean puedeAtacar(Unidad obj){
		if(this.estaMuerto() || obj.estaMuerto())
			return false;
		
		double distancia = this.posicion.distanciaCon(obj.posicion);
		
		if(distancia >= this.distanciaMinima && distancia <= this.distanciaMaxima && this.puedeRealizarAtaque())
			return true;
		
		return false;
	}
	
	public boolean atacar(Unidad obj){
		
		if(this.puedeAtacar(obj)){
			this.realizarAtaque();
			obj.fueAtacado(this.getAtaque());
			return true;
		}
		
		return false;
		
	}

	public boolean estaMuerto() {

		return this.salud <= 0;

	}

	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}

	public double getSalud() {
		return salud;
	}

	public void setSalud(double salud) {
		this.salud = salud;
	}

	public double getEnergia() {
		return energia;
	}

	public void setEnergia(double energia) {
		this.energia = energia;
	}

	public double getDefensa() {
		return defensa;
	}

	public void setDefensa(double defensa) {
		this.defensa = defensa;
	}

	public double getDistanciaMinima() {
		return distanciaMinima;
	}

	public double getDistanciaMaxima() {
		return distanciaMaxima;
	}

	public int getCantidadDeFlechas() {
		return cantidadDeFlechas;
	}

	public Punto getPosicion() {
		return posicion;
	}
	
	public double getEnergiaMaxima() {
		return ENERGIA_MAXIMA;
	}
	
}
