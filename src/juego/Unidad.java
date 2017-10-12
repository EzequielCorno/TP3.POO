package juego;

public abstract class Unidad {
	/**
	 * Energia maxima de una Unidad
	 */
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
	/**
	 * Distancia minima de alcanse del ataque de la Unidad
	 */
	protected double distanciaMinima;
	/**
	 * Distancia maxima de alcanse del ataque de la Unidad
	 */
	protected double distanciaMaxima;
	/**
	 * Cantidad de flechas inicial de la Unidad
	 */
	protected int cantidadDeFlechas;
	/**
	 * Defensa inicial de la Unidad
	 */
	protected double defensa;
	/**
	 * Punto inicial de la Unidad
	 */
	protected Punto posicion;
	/**
	 * Constructor parametrizado de Unidad
	 * @param posicion donde se crea la Uniddad
	 */
	public Unidad(Punto posicion) {
		this.posicion = posicion;
	}
	/**
	 * Constructor por copia de Unidad
	 * @param unidad 
	 */
	public Unidad(Unidad unidad){
		this.ataque = unidad.getAtaque();
		this.defensa = unidad.getDefensa();
		this.energia = unidad.getEnergia();
		this.salud = unidad.getSalud();
		this.distanciaMaxima = unidad.getDistanciaMaxima();
		this.distanciaMinima = unidad.getDistanciaMinima();
		this.posicion = unidad.getPosicion();
	}
	/**
	 * Dependiendo de la unidad realiza una accion distinta
	 */
	public abstract void consumirAgua();
	/**
	 * Dependiendo de la unidad realiza una validacion distinta 
	 * @return true o false dependiendo si puede atacar
	 */
	public abstract boolean puedeRealizarAtaque();
	/**
	 * Dependiendo de la unidad realiza cambios en los atributos de la unidad
	 */
	public abstract void realizarAtaque();
	/**
	 * Descuenta el daño recibido por parametro a la salud de la unidad
	 * @param daño valor del ataque realizado por la Unidad atacante
	 */
	public abstract void fueAtacado(double daño);
	/**
	 * Dependiendo de la unidad 
	 * @param Recibe una Unidad a la cual desea atacar
	 * @return Devuelve true o false denpendiendo de las condiciones de cada Unidad
	 */
	public boolean puedeAtacar(Unidad obj){
		if(this.estaMuerto() || obj.estaMuerto())
			return false;
		
		double distancia = this.posicion.distanciaCon(obj.posicion);
		
		if(distancia >= this.distanciaMinima && distancia <= this.distanciaMaxima && this.puedeRealizarAtaque())
			return true;
		
		return false;
	}
	/**
	 * 
	 * @param Recibe una Unidad a la cual se desea atacar
	 * @return Retorna si pudo o no atacar
	 */
	public boolean atacar(Unidad obj){
		
		if(this.puedeAtacar(obj)){
			this.realizarAtaque();
			obj.fueAtacado(this.getAtaque());
			return true;
		}
		
		return false;
		
	}
	/**
	 * 
	 * @return Retorna si esta muerto o vivo
	 */
	public boolean estaMuerto() {

		return this.salud <= 0;

	}
	/**
	 * 
	 * @return Devuelve el valor del atributo ataque
	 */
	public double getAtaque() {
		return ataque;
	}
	/**
	 * 
	 * @param Recibe un valor para setear el atributo ataque
	 */
	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}
	/**
	 * 
	 * @return Devuelve el valor del atributo salud
	 */
	public double getSalud() {
		return salud;
	}
	/**
	 * 
	 * @param Recibe un valor para setear el atributo salud
	 */
	public void setSalud(double salud) {
		this.salud = salud;
	}
	/**
	 * 
	 * @return Devuelve el valor del atributo energia
	 */
	public double getEnergia() {
		return energia;
	}
	/**
	 * 
	 * @param Recibe un valor para setear el atributo energia
	 */
	public void setEnergia(double energia) {
		this.energia = energia;
	}
	/**
	 *
	 * @return Devuelve el valor del atributo defensa
	 */
	public double getDefensa() {
		return defensa;
	}
	/**
	 * 
	 * @param Recibe un valor para setear el atributo defensa
	 */
	public void setDefensa(double defensa) {
		this.defensa = defensa;
	}
	/**
	 * 
	 * @return Devuelve el valor del atributo distanciaMinima
	 */
	public double getDistanciaMinima() {
		return distanciaMinima;
	}
	/**
	 * 
	 * @return Devuelve el valor del atributo distanciaMaxima
	 */
	public double getDistanciaMaxima() {
		return distanciaMaxima;
	}
	/**
	 * 
	 * @return Devuelve el valor del atributo cantidadDeFlechas
	 */
	public int getCantidadDeFlechas() {
		return cantidadDeFlechas;
	}
	/**
	 * 
	 * @return Devuelve el valor del atributo posicion
	 */
	public Punto getPosicion() {
		return posicion;
	}
	/**
	 *
	 * @return Devuelve el valor del atributo getEnergiaMaxima
	 */
	public double getEnergiaMaxima() {
		return ENERGIA_MAXIMA;
	}
	
}
