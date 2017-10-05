package Decorator;

public class Puñal extends DecoratorItem{
		private double bonusFuerza;
		private int bonusDefensa;
		private int bonusEnergia;
		
	public Puñal() {
			bonusFuerza=3;
			bonusDefensa=-3;
			bonusEnergia=0;
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
