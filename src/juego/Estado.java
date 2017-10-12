package juego;

public abstract class Estado {
	
	public abstract Estado consumirAgua();
	public abstract Estado realizarAtaqueConCaballo();
	public abstract boolean atacar();
	
	public Estado getEstado(){
		return this;
	}
	
}
