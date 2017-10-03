package juego;

public abstract class Estado {
	
	public abstract Estado consumirAgua();
	public abstract Estado atacar();
	
	public Estado getEstado(){
		return this;
	}
	
}
