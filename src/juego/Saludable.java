package juego;

public class Saludable extends Estado{

	private int cantAtaques;
	
	public Saludable(){
		cantAtaques=0;
	}
	
	@Override
	public Estado consumirAgua() {
		return this;
	}

	@Override
	public Estado atacar() {
		if(++cantAtaques == 3)
			return new Rebelde();
		return this;
	}

}
