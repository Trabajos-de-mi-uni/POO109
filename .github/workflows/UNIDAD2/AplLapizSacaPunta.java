package UNIDAD2;
import UNIDAD1.*;
public class AplLapizSacaPunta {

	public static void main(String[] args) {
		
		SacaPuntas sacaPunta = new SacaPuntas();
		
		Lapiz      bic   = new Lapiz();
		Lapiz      lapizAzul=new Lapiz(15);
		
		
		
		
		Libreta scribe = new Libreta();
		
		
		
		if (sacaPunta.SacarPunta(bic) ) {
			System.out.println("SE LE SACO PUNTA AL LAPIZ");
		} else {
			System.out.println("NO SE PUDO SACAR PUNTO");
			
		}
		
		if (sacaPunta.SacarPunta(lapizAzul) ) {
			System.out.println("SE LE SACO PUNTA AL LAPIZ");
		} else {
			System.out.println("NO SE PUDO SACAR PUNTO");
			
		}
		
		boolean ban=lapizAzul.Escribir("es una prueba de escritura afectando la libreta",scribe);
		ban=bic.Escribir("es una prueba de escritura afectando la libreta con el lapiz bic",scribe);
		
		if( ban )
			System.out.println("se escrbio en la libreta \t"+scribe);
		else
			System.out.println("no se pudo escribir "+lapizAzul.getMsg());
		
		// quiero llenar la libreta con el lapiz bic
		int renglon=0;
		while (scribe.getRenDisponible()<scribe.getRenglones()-1) {
			renglon++;
			lapizAzul.Escribir("RENGLON "+renglon, scribe);
			
			
		}
		System.out.println("Contenido de la libreta "+scribe);

	}

}
