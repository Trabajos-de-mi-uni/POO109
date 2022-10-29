package UNIDAD2;

public class Tapa {
	private boolean puesta;
	public Tapa() {
		puesta=true; // la tapa está sobre el contenedor.
	}
	public boolean EstaPuesta() {
		return puesta;
	}

	public boolean Poner() {
		if(puesta) {
			return false;
		}
		puesta=true;
		return true;
	}
	public boolean Quitar() {
		if(!puesta) {
			return false;
		}
		puesta=false;
		return true;
	}
}
