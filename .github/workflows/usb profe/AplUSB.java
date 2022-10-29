package UNIDAD2;

import java.util.regex.Pattern;

public class AplUSB {

	public static void main(String[] args) {
		
		USB40 usb=new USB40(200,15);
		
	for(int i=0 ; i<3 ; i++) {	
		System.out.println(usb.Grabar(new Archivo("Examen","DAT",6,"gb")));
		System.out.println(usb.Grabar(new Archivo("Examen","DAt",5,"gb")));
		System.out.println(usb.Grabar(new Archivo("Examen","DAT",5,"gb")));
		System.out.println(usb.Grabar(new Archivo("Examen","DAT",5,"gb")));
		System.out.println(usb.Grabar(new Archivo("Examen","DAT",25,"gb")));
	}	
		System.out.println("**************CONTENIDO***********");
		System.out.println(usb);
		Archivo archivo=new Archivo("Examen(001)","DAT",0,"");
		System.out.println(usb.Borrar(archivo));
		Archivo archivo2=new Archivo("Examen","DAT",0,"");
		System.out.println(usb.Borrar(archivo2, 'a'));
		System.out.println(usb.Grabar(new Archivo("Examen","DAT",5,"gb")));
		System.out.println("**************CONTENIDO***********");
		System.out.println(usb);
		
//		String cadena="mexico(";
//		String separador=Pattern.quote("[");				//"\\(";
//
//		String [] arr=cadena.split(Pattern.quote("("));
//		System.out.println(arr[0]+" arr= "+arr.length);

	}

}
