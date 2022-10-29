package UNIDAD2;

public class Enciclopedia extends Libro {
	private int noTomos;
	public Enciclopedia(String titulo,String autor,String editorial,int noTomos) {
		super(titulo,autor,editorial);
		this.noTomos=noTomos;
	}
	public String toString() {
		return super.toString()+"\nNoTomos : "+noTomos;
	}
	public int getNoTomos() {
		return noTomos;
	}
	public void setNoTomos(int noTomos) {
		this.noTomos = noTomos;
	}

}
