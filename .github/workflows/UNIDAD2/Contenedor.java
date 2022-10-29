package UNIDAD2;

public class Contenedor {
	private int capacidad, nivelLiquido;
	public Contenedor() {
		this(500);
	}
	public Contenedor(int ml) {
		capacidad=ml;
		nivelLiquido=0;
	}
	public boolean EstaLleno() {
/*
		if(capacidad==nivelLiquido)
			return true;
		return false;
*/
//		return capacidad==nivelLiquido? true : false ;
		return capacidad==nivelLiquido;
	}
	public boolean Poner(int ml) {
		if(ml<0)
			return false;
		if(nivelLiquido+ml > capacidad) {
			ml=capacidad-nivelLiquido;
		}
		nivelLiquido+=ml;
		return true;
	}
	public boolean Sacar(int ml) {
		if(nivelLiquido==0)
			return false;
		if(nivelLiquido < ml)
			ml=nivelLiquido;
		nivelLiquido-=ml;
		return true;
		
		
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getNivelLiquido() {
		return nivelLiquido;
	}
	public void setNivelLiquido(int nivelLiquido) {
		this.nivelLiquido = nivelLiquido;
	}
	
}
