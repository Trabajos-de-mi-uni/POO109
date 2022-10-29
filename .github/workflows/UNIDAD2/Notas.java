package UNIDAD2;

public class Notas {
	private String titulo,autor;
	
	public Notas(String titulo,String autor) {
		this.titulo=titulo;
		this.autor=autor;
	}
	
	public String toString() {
		return "Titulo : "+titulo+
				"\nAutor: "+autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
