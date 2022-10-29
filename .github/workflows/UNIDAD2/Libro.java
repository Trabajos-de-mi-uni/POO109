package UNIDAD2;

public class Libro extends Notas {
	private String editorial;
	public Libro(String titulo,String autor, String editorial) {
		super(titulo,autor);
		this.editorial=editorial;
	}
	
	public String toString() {
		return super.toString()+"\nEditorial : "+editorial;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
}
