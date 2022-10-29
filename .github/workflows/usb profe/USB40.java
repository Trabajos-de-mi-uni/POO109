package UNIDAD2;

import Cadenas.Rutinas;

public class USB40 extends USB30 {
	public USB40(){
		super();
	}
	public USB40(int memoria, int archivos ){
		super(memoria, archivos);
	}
	public boolean Borrar(Archivo archivo, char c){
		String nombre=archivo.getNombre(), extension=archivo.getExtension();
		Archivo [] archivos=getArchivos();
		
		int i=-1, pos=-1;
		for( Archivo arch : archivos) {
			i++;
			if(nombre.equalsIgnoreCase(arch.getNombre() )  && 
					extension.equalsIgnoreCase(arch.getExtension() )) {
				pos=i;
				break;
			}
			
		}
		if(pos==-1) {
			this.setMsg("No hay archivos con este nombre");
			return false;
		}
		String []palabra;
		
		String nombreCop = archivos[i].getNombre(), extensionCop = archivos[i].getExtension();
		  palabra = nombreCop.split("\\(");
		nombreCop=palabra[0];
			
		while( nombre.equalsIgnoreCase(nombreCop) && extension.equalsIgnoreCase(extensionCop) && i<=sub) {
			nombreCop=archivos[i].getNombre();
			palabra= nombreCop.split("\\(");
			nombreCop=palabra[0];
			extensionCop=archivos[i].getExtension();
			Borrar(archivos[i]);
			
			
			
			
		}
		return true;
	}
	public boolean Grabar(Archivo archivo){
		
		if(!super.Grabar(archivo)){
			return false;
		}
		String nombre=archivo.getNombre(), extension=archivo.getExtension();
		Archivo [] archivos=getArchivos();
		int i=-1;
		for( Archivo arch : archivos) {
			i++;
			if(nombre.equalsIgnoreCase(arch.getNombre() )  && 
					extension.equalsIgnoreCase(arch.getExtension() )) {
				break;
			}
			
		}
		
		if(archivos[i].getNombre().equalsIgnoreCase(nombre) && i+1>=sub){
			return true;
		}
		int veces=0;
		String []palabra;
		
		String nombreCop = archivos[i].getNombre(), extensionCop = archivos[i].getExtension();
		  palabra = nombreCop.split("\\(");
		nombreCop=palabra[0];
			
		while( nombre.equalsIgnoreCase(nombreCop) && extension.equalsIgnoreCase(extensionCop) && i<=sub ) {
			if(archivos[i].getNoCopia()==0){
				i++;
				veces++;
				continue;
				
			}
			if(archivos[i]==null)
				break;
			
			nombreCop=archivos[i].getNombre();
			palabra= nombreCop.split("\\(");
			nombreCop=palabra[0];
			extensionCop=archivos[i].getExtension();
			
			archivos[i].setNombre(nombreCop+"("+Rutinas.PonCeross(veces,3)+")");
			archivos[i].setNoCopia(veces);
			
			veces++;
			
			i++;
		}
		return true;
		
	}
	
}
