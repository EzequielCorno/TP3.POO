package juego;

public class Caballo {
	
	private Estado estado;
	
	public Caballo(){
		estado = new Saludable();
	}
	
	public void consumirAgua(){
		estado = estado.consumirAgua();
	}
	
	public void realizarAtaqueConCaballo(){
		estado = estado.realizarAtaqueConCaballo();
	}

	public Estado getEstado() {
		return estado;
	}

	
}
