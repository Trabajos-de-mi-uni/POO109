package UNIDAD2;

public class Boquilla {
	private boolean posicion;
	
	public Boquilla() {
		posicion=true; // boquilla cerrada
	}
	public boolean EstaAbierta() {
		return posicion;
	}
	public boolean Cerrar() {
		if(posicion)
			return false;
		posicion=true;
		return true;
	}
	public boolean Abrir() {
		if(!posicion)
			return false;
		posicion=false;
		return true;
	}
}
