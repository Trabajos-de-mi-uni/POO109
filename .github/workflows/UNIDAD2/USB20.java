package UNIDAD2;

public class USB20 extends USB {
	public USB20() {
		super();
	}
	public USB20(long capacidadMemoria, int capacidadArchivos) {
		super(capacidadMemoria,capacidadArchivos);
	}
	public boolean Grabar(Archivo archivo) {
		if(archivo.getTamaño()>5)
			archivo.setTamaño(archivo.getTamaño()/2);
		if(! super.Grabar(archivo)) {
			return false;
		}
		Archivo [] arch=getArchivos();
		// Intercambio
		for(int i=0 ; i < sub ; i++) {
			for(int j=i+1 ; j<=sub ; j++) {
				if(arch[i].toString().compareToIgnoreCase(arch[j].toString())>0) {
					Archivo aux=arch[i];
					arch[i]=arch[j];
					arch[j]=aux;
				}
			}
		}
		return true;
		
	}
	
	
}


