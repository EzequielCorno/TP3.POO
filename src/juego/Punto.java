package juego;

public class Punto {
	/**
	 * Coordenado X del plano
	 */
	private double x;
	/**
	 * Coordenada Y del plano
	 */
	private double y;
	/**
	 * Inicializa un punto con las coordenadas que recibe
	 * @param d
	 * @param e
	 */
	public Punto(double d, double e) {
		this.x = d;
		this.y = e;
	}
	/**
	 * Obtiene el valor del atributo X
	 * @return
	 */
	public double getX() {
		return x;
	}
	/**
	 * Obtiene el valor del atributo Y
	 * @return
	 */
	public double getY() {
		return y;
	}
	/**
	 * Calcula la distancia entre dos puntos
	 * @param punto
	 * @return
	 */
	public double distanciaCon(Punto punto) {
		return Math.sqrt(Math.pow(x - punto.x, 2) + Math.pow(y - punto.y, 2));
	}

}
