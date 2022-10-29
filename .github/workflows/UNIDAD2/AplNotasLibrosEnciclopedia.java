package UNIDAD2;

public class AplNotasLibrosEnciclopedia {

	public static void main(String[] args) {
		Notas notas=new Notas("P  O  O","GPO DE 12:00  A  13:00");
		
		System.out.println(notas);
		System.out.println("____________________");
		Libro libro = new Libro("ED","GPO ESPECIAL","McGraw Hill");
		System.out.println(libro);
		
		Enciclopedia enci = new Enciclopedia("ED","GPO ESPECIAL","McGraw Hill",20);
		System.out.println("____________________");
		System.out.println(enci);
		
		System.out.println("_______de la enciclopedia quiero el autor y tomos_____________");
		System.out.println(enci.getAutor());
		System.out.println(enci.getNoTomos());
	}

}
