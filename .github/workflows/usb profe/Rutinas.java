package Cadenas;
import java.util.*;
public class Rutinas {
	static Random R=new Random();
	static String []VN ={"Daniel","Yessenia","Luis","Anastacia","Plutarco","Alicia","Maria","Sofia","Antonio","Nereida","Carolina",
		"Rebeca","Javier","Luis"};
	static String [] VA={"Garcia","Lopez","Perez","Urias","Mendoza","Coppel","Diaz"};
	static boolean [] Sexo={true,false,true,false,true,false,false,false,true,false,false,
		false,true,true};	

	public static String nextNombre(int Numero){
		String Nom="",NomTra="";
		int Pos;
		boolean Genero=true;;

		for(int i=0;i<Numero;i++){
			Pos=R.nextInt(VN.length);

			NomTra=VN[Pos]+" ";

			if (i==0){
				Genero=Sexo[Pos];
			}

			if( Genero != Sexo[Pos]  || i>0 && Nom.indexOf(NomTra)>-1    ){
				i--;
				continue;
			}	

			Nom+=NomTra;

		}
		NomTra="";
		for(byte i=0;i<2;i++){
			NomTra+=VA[R.nextInt(VA.length)]+" ";
		}
		return NomTra+Nom.trim();
	} 
	public static String MiTrim(String texto) {
/* VERSION 1
		texto=texto.trim();
		String resultado="";

		char car;
		for(int i=0 ; i<texto.length(); i++) {
			
			car=texto.charAt(i);
			if( car==' ') {
				while (i< texto.length() && texto.charAt(i)==' ') 
					i++;
				i--;
				resultado=resultado+" ";
				continue;
			}

			resultado=resultado+car;
		}
		return resultado;
*/
/*
		// VERSION 2
		texto=texto.trim();
		String [] palabras=texto.split(" ");
		String resultado="";
		for(int i=0 ; i< palabras.length ; i++)
			if(palabras[i].length()>0)
				resultado=resultado+palabras[i]+" ";
		
		return resultado.trim();
*/
	// version 3
		texto=texto.trim();
		String resultado="";
        boolean band=true;
		char car;
		for(int i=0 ; i<texto.length(); i++) {
			car=texto.charAt(i);
			if(car==' ' && band) {
				band=false;
				resultado=resultado+" ";
				continue;
			}
			if(car !=' ' ) {
				band=true;
				resultado=resultado+car;
			}
			
			
		}
		return resultado;
	}

	public static String PonBlancos(String texto, int cuantos) {
		while (texto.length()<cuantos)
			texto=texto+" ";
		return texto;
	}
	public static String PonCeross(int numero, int cuantos) {
		String texto=numero+"";
		while (texto.length()<cuantos)
			texto="0"+texto;
		return texto;
	}
}
