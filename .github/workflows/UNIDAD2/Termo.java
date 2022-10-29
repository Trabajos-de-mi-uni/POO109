package UNIDAD2;
import java.util.*;
public class Termo {

	private Contenedor contenedor;
	private Tapa        tapa;
	private Boquilla    boquilla;
	private String msg;


	public Termo() {
		contenedor=new Contenedor();
		tapa      =new Tapa();
		boquilla  =new Boquilla();
	}
	
	public boolean Beber(int tipoTrago) {
		if( !tapa.EstaPuesta()) {
			msg="no se puede beber por no tener puesta la tapa";
			return false;
		}
		
		if( boquilla.EstaAbierta()) {
			msg="No se puede beber por que la boquilla está cerrada";
			return false;
		}
		if(contenedor.getNivelLiquido()==0) {
			msg="No se ppuede beber por estar vacio el contendor";
			return false;
		}
		int ml=0;
		switch (tipoTrago) {
		case 1: ml=new Random().nextInt(3)+1;
			break;
		case 2:ml=new Random().nextInt(4)+4;
			break;
		case 3:ml=new Random().nextInt(5)+8;
			break;
		}
		contenedor.Sacar(ml);
		return true;
	}
	public boolean Poner(int ml) {
		if( tapa.EstaPuesta() ) {
			msg="No puede poner poner liquido debido a que la tapa esta puesta en el contenedor";
			return false;
		}
		if( contenedor.EstaLleno()) {
			msg="El contenedor esta lleno";
			return false;
		}
		
		contenedor.Poner(ml);
		
		return true;
	}
	public boolean QuitarTapa() {
		return tapa.Quitar();
	}
	public boolean PonerTapa() {
		return tapa.Poner();
	}
	public boolean AbrirBoquilla() {
		return boquilla.Abrir();
	}
	public boolean CerrarBoquilla() {
		return boquilla.Cerrar();
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int NivelLiquido() {
		return contenedor.getNivelLiquido();
	}
}
