package Decorator;

public class Escudo extends DecoratorItem{
	double defensaEscudo = 40;

	public double getDefensaEscudo() {
		return defensaEscudo;
	}

	@Override
	protected int getBonusFuerza() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int getBonusDefensa() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int getBonusEnergia() {
		// TODO Auto-generated method stub
		return 0;
	}

}
