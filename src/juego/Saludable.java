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
	
	public boolean atacar(){
		return true;
	}

	@Override
	public Estado realizarAtaqueConCaballo() {
		if(++cantAtaques == 3)
			return new Rebelde();
		return this;
	}

}
