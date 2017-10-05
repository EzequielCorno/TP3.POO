package Decorator;

public class Capa extends DecoratorItem{
	
	private double bonusFuerza;
	private int bonusDefensa;
	private int bonusEnergia;
	
	public Capa() {
		bonusFuerza=0.1;
		bonusDefensa=0;
		bonusEnergia=2;
	}
	
	@Override
	public double getBonusFuerza() {
		return bonusFuerza;
	}

	@Override
	public int getBonusDefensa() {
		return bonusDefensa;
	}

	@Override
	public int getBonusEnergia() {
		return bonusEnergia;
	}

	
}
