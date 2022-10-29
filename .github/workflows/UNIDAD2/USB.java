package UNIDAD2;

public class USB {
	private long capacidadMemoria;
	private int  capacidadArchivos;
	private Archivo [] archivos;
	protected int sub;
	private String msg;
	
	public USB() {
		this(8,100);
	}
	public USB(long capacidadMemoria, int capacidadArchivos) {
		this.capacidadMemoria=capacidadMemoria*1024*1024*1024;
		this.capacidadArchivos=capacidadArchivos;
		archivos=new Archivo[capacidadArchivos];
		sub=-1; // señala la posición del ultimo archivo grabado
	}
	final public boolean Borrar(Archivo archivo) {
		if(archivo.getNombre().length()==0 || archivo.getExtension().length()==0) {
			msg="Debe de proporcionar nombre y extensión del archvio";
			return false;
		}
		if(sub==-1) {
			msg="La USB no tiene archivos guardados";
			return false;
		}
		// buscar si archivo está almacenado en la USB
		int pos=-1;
		int i=-1;
		for( Archivo arch : archivos) {
			i++;
			if(archivo.getNombre().equalsIgnoreCase(arch.getNombre() )  && 
					archivo.getExtension().equalsIgnoreCase(arch.getExtension() )) {
				pos=i;
				break;
			}
		}
		if(pos==-1) {
			msg="El archivo no se encuentra en la USB";
			return false;
		}
		for(i=pos ; i<sub ; i++) {
			archivos[i]=archivos[i+1];
		}
		archivos[sub]=null;
		sub--;
		return true;
	}
	
	public boolean Grabar(Archivo archivo) {
		// validar capacidad de archivos
		if(sub==archivos.length-1) {
			msg="No se puede grabar el archivo, no hay capacidad para archivo";
			return false;
		}
		long byteNecesita= Convierte( archivo.getTamaño(), archivo.getUm());
		
		if( byteNecesita >capacidadMemoria ) {
			msg="No hay memoria suficiente para grabar el nuevo archivo";
			return false;
		}
		if(Repetido(archivo)) {
			msg="No se puede grabar, por ser nomnbre y extensión repetido";
			return false;
		}
		capacidadMemoria-= byteNecesita;
		sub++;
		archivos[sub]=archivo;
		return true;
	}
	private long Convierte(int tamaño, String UM) {
		UM=UM.toUpperCase();
		switch (UM) {
		case "BYTE": return tamaño;
		case "KB": return tamaño*1024;
		case "MB": return tamaño*1024*1024;
		case "GB": return tamaño*1024*1024*1024;
		}
		return 0;
	}

	public String toString() { // muestra el contenido
		String contenido="\n";
		
		for(int i=0 ; i<=sub ; i++) {
			contenido+=archivos[i].getNombre()+"\t"+archivos[i].getExtension()+"\t"+archivos[i].getTamaño()+"\n";
		}
		return contenido;
	}
	private boolean Repetido(Archivo archivo) {
		
		for(int i=0 ; i<=sub ; i++) {
			if(archivo.getNombre().equalsIgnoreCase(archivos[i].getNombre()) &&
				archivo.getExtension().equalsIgnoreCase(archivos[i].getExtension())	) {
				return true;
			}
		}
		return false;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Archivo[] getArchivos() {
		return archivos;
	}
	public void setArchivos(Archivo[] archivos) {
		this.archivos = archivos;
	}
	
}
