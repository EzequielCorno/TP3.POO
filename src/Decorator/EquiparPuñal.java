package Decorator;

import juego.Unidad;

public class EquiparPuñal extends UnidadEquipada {

	private static double BONUS_DEFENSA = 3;
	private static double BONUS_ATAQUE = 3;

	public EquiparPuñal(Unidad unidad) {
		super(unidad);
	}

	public double getDefensa() {
		return (super.getDefensa() - BONUS_DEFENSA);
	}

	public double getAtaque() {
		return (super.getAtaque() + BONUS_ATAQUE);
	}

	public void fueAtacado(double daño) {
		this.uni.fueAtacado(daño + BONUS_DEFENSA);
	}
}
