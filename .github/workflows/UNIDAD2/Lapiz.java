package UNIDAD2;
import java.util.Random;
import UNIDAD1.*;
public class Lapiz {
	private int longLapiz, longBorrador, longPunta;




	private boolean tieneBorrador;
	private String tipoMadera,  msg;

	public Lapiz() {
		this(12);
	}
	public Lapiz(int longLapiz) {
		this(longLapiz,"Suave");
	}
	public Lapiz(int longLapiz, String tipoMadera) {
		this.longLapiz=longLapiz * 10; // la long la convertimos a ml
		tieneBorrador=  new Random().nextBoolean();
		if(tieneBorrador)
			longBorrador=20; // long del borrador por 20
		this.tipoMadera=tipoMadera;
		longPunta=0;
	}	
	public boolean Escribir(String texto, Libreta libreta) {
		texto=texto.trim();
		String [] palabras=texto.split(" ");
		int noPalabras=palabras.length;
		if (  ! Escribir(noPalabras) )
			return false;
		return libreta.Recibir(texto);
	}
	public boolean Escribir(int noPalabras) {
		if(longPunta<2) {
			msg="El tamaño de la punta no es el adecuado";
			return false;
		}
		if(longLapiz<10) {
			msg="la longitud del lápiz es inadecuada";
			return false;
		}
		int mlDisminuir= noPalabras / 10;
		longPunta -= mlDisminuir;
		if(longPunta < 0)
			longPunta=0;
		return true;
	}
	public boolean Borrar(String texto) {
		texto=texto.trim();
		String [] palabras=texto.split(" ");
		int noPalabras=palabras.length;
		return Borrar(noPalabras);
	}
	public boolean Borrar(int noPalabras) {
		if ( !tieneBorrador) {
			msg="El lapiz no cuenta con borrador";
			return false;
		}
		if( longBorrador < 2) {
			msg="El tamaño del borrador es inadecuado";
			return false;
		}
		if ( noPalabras/2 > longBorrador) {
			msg="El tamaño del borrasdor no alcanza para borrar las palabras";
			return false;
		}
		longBorrador -=noPalabras/2 ;
		return true;
	}
	public int getLongLapiz() {
		return longLapiz;
	}
	public void setLongLapiz(int longLapiz) {
		this.longLapiz = longLapiz;
	}
	public String getTipoMadera() {
		return tipoMadera;
	}
	public void setTipoMadera(String tipoMadera) {
		this.tipoMadera = tipoMadera;
	}
	public int getLongPunta() {
		return longPunta;
	}
	public void setLongPunta(int longPunta) {
		this.longPunta = longPunta;
	}

	
	public String getMsg() {
		return msg;
	}	
}