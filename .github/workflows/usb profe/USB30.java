package UNIDAD2;

import Cadenas.Rutinas;

public class USB30 extends USB20{
//	private String [] noCopias; 
	public USB30() {
		super();
//		noCopias=new String[getArchivos().length];
	}
	public USB30(long capacidadMemoria, int capacidadArchivos) {
		super(capacidadMemoria,capacidadArchivos);
//		noCopias=new String[getArchivos().length];
	}
	public boolean Grabar(Archivo archivo) {
		int tamaño=archivo.getTamaño();
		if(super.Grabar(archivo)) {
			return true;
		}
		if( !this.getMsg().equalsIgnoreCase("No se puede grabar, por ser nomnbre y extensión repetido")) {
			return false;
		}
		int veces=VecesExiste(archivo)+1;
		archivo.setNoCopia(veces);
		archivo.setNombre(archivo.getNombre()+"("+Rutinas.PonCeross(veces,3)+")");
		archivo.setTamaño(tamaño);
		archivo.setNoCopia(veces);
		return super.Grabar(archivo);
		

	}
/*
	public boolean Grabar(Archivo archivo) {

		if(super.Grabar(archivo)) {
			return true;
		}
		if( !this.getMsg().equalsIgnoreCase("No se puede grabar, por ser nomnbre y extensión repetido")) {
			return false;
		}
		Archivo [] arch=getArchivos();
		int veces=VecesExiste(archivo);
		sub++;
		arch[sub]=archivo;
		noCopias[sub]="("+veces+")";
		// ordeno
		for(int i=0 ; i < sub ; i++) {
			for(int j=i+1 ; j<=sub ; j++) {
				if(arch[i].toString().compareToIgnoreCase(arch[j].toString())>0) {
					Archivo aux=arch[i];
					arch[i]=arch[j];
					arch[j]=aux;
					String copia=noCopias[i];
					noCopias[i]=noCopias[j];
					noCopias[j]=copia;
				}
			}
		}		
		
		return true;
	}
*/	
	private int VecesExiste(Archivo archivo) {
		int veces=0;
		Archivo [] arch=getArchivos();
		String [] partes;
		String nombre;
		for(int i=0 ; i<=sub ; i++) {
			nombre=arch[i].getNombre();

			int posicion=arch[i].getNombre().indexOf('(');
			if(arch[i].getNombre().indexOf('(')>-1) {
			   // partes=arch[i].getNombre().split("(");
			    nombre=nombre.substring(0,posicion);
			}

			if(archivo.getNombre().equalsIgnoreCase(nombre) &&
					archivo.getExtension().equalsIgnoreCase(arch[i].getExtension())	) {
					if(arch[i].getNoCopia()>veces)
						veces=arch[i].getNoCopia();
				}			
		}
		return veces;
	}
	public String toString() { // muestra el contenido
		String contenido="";
		Archivo [] arch=getArchivos();
		for(int i=0 ; i<=sub ; i++) {
			String formateada=String.format("%-20s %-5s %5d %-5s\n",arch[i].getNombre(),arch[i].getExtension(),arch[i].getTamaño(),arch[i].getUm() );
			//contenido+=arch[i].getNombre()+(noCopias[i]==null?"":noCopias[i])+"\t"+arch[i].getExtension()+"\t"+arch[i].getTamaño()+"\n";
			contenido+=formateada;
		}
		return contenido;
	}
	
}
