package Decorator;

import juego.Unidad;

public class EquiparCapa extends UnidadEquipada{
	
	private static final double BONUS_FUERZA = 0.9;
	private static final double BONUS_ENERGIA = 2;
	private  final double ENERGIA_MAXIMA = 200;
		
	public EquiparCapa(Unidad unidad) {
		super(unidad);
	}
	
	public double getAtaque(){
		return super.getAtaque() * BONUS_FUERZA;
	}
	
	public double getEnergia(){
		return super.getEnergia() * BONUS_ENERGIA;
	}
	
	public void fueAtacado(double daño) {
		this.uni.fueAtacado(daño);
	}
	
	public  double getEnergiaMaxima() {
		return ENERGIA_MAXIMA;
	}
}
