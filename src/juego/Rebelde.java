package juego;

public class Rebelde extends Estado{

	private int contadorAgua;
	
	public Rebelde(){
		contadorAgua=0;
	}
	
	@Override
	public Estado consumirAgua() {
		if(++contadorAgua == 1)
			return new Saludable();
		return this;
	}

	@Override
	public boolean atacar() {
		return false;
	}

	@Override
	public Estado realizarAtaqueConCaballo() {
		return this;
	}

}
