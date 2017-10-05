package Decorator;

public class Escudo extends DecoratorItem{
	double defensaEscudo = 40;

	public double getDefensaEscudo() {
		return defensaEscudo;
	}

	@Override
	public double getBonusFuerza() {
		return 0;
	}

	@Override
	public int getBonusDefensa() {	
		return 0;
	}

	@Override
	public int getBonusEnergia() {
		return 0;
	}

}
