package Decorator;

import juego.Unidad;

public class EquiparPuñal extends UnidadEquipada{

	private int bonusDefensa;
	private int bonusAtaque;
	
	public EquiparPuñal(Unidad unidad) {
		super(unidad);
		this.bonusDefensa = 3;
		this.bonusAtaque = 3;
	}
	
	public double getDefensa(){
		return (super.getDefensa() - bonusDefensa);
	}
	
	public double getAtaque(){
		return (super.getAtaque() + bonusAtaque);
	}
		
}
