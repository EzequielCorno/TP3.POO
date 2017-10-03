package juego;

public abstract class Estado {
	
	public abstract Estado consumirAgua();
	public abstract Estado fueAtacado();
	public abstract boolean atacar();
	
	public Estado getEstado(){
		return this;
	}
	
}
