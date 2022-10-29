package UNIDAD2;
import Cadenas.*;
public class Archivo {
	private String nombre, extension, um;
	private int tamaño, noCopia;
	
	public Archivo(String nombre, String extension,int tamaño, String um) {
		this.nombre=nombre;
		this.extension=extension;
		this.tamaño=tamaño;
		this.um=um;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getUm() {
		return um;
	}
	public void setUm(String um) {
		this.um = um;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public String toString() {
		return Rutinas.PonBlancos(nombre,40)+extension;
	}
	public int getNoCopia() {
		return noCopia;
	}
	public void setNoCopia(int noCopia) {
		this.noCopia = noCopia;
	}
	
}
