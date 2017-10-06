package Decorator;

import juego.Unidad;

public class EquiparCapa extends UnidadEquipada{
	
	private double bonusFuerza;
	private double bonusEnergia;
		
	public EquiparCapa(Unidad unidad) {
		super(unidad);
		this.bonusFuerza = 0.9;
		this.bonusEnergia = 2;
	}
	
	public double getAtaque(){
		return super.getAtaque() * bonusFuerza;
	}
	
	public double getEnergia(){
		return super.getEnergia() * bonusEnergia;
	}
	
}
