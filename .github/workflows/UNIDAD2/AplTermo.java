package UNIDAD2;

public class AplTermo {

	public static void main(String[] args) {
		
		Termo yeti = new Termo();
		yeti.QuitarTapa();
		if ( !yeti.Poner(100)) {
			System.out.println("no pudo porner liquido :"+yeti.getMsg());
			return;
		} else {
			System.out.println("el liquido se introdujo exitosamente");
		}
		System.out.println(yeti.PonerTapa());
		yeti.AbrirBoquilla();
		int tragos=0;
		while ( yeti.Beber(1)) {
			tragos++;
			System.out.printf("%10d \t %10d \n",tragos, yeti.NivelLiquido());
			if(tragos==100)
				break;
		}
		
		
		
		

	}

}
