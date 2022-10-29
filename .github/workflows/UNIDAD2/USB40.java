package UNIDAD2;

public class USB40 extends USB30{
	private final int tamaño=100;
	public USB40() {
		super();
	}
	public USB40(long capacidadMemoria, int capacidadArchivos) {
		super(capacidadMemoria,capacidadArchivos);
	}

	public boolean BorrarTodo(Archivo archivo) {
		
		return true;
	}
	public boolean Grabar(Archivo archivo) {
		if( !super.Grabar(archivo)) {
			return false;
		}
		return true;
	}
	
	
	public void CambiaNombre(int posicion) {
		if(posicion<0 || posicion>sub)
			return;
		Archivo [] archivos=getArchivos();
		
		archivos[posicion].setNombre("NUEVO");
		
		
	}
}
