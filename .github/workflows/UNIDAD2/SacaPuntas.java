package UNIDAD2;

import java.util.Random;
public class SacaPuntas {
	private float vidaUtilNavaja;
	private int   contenedorBasura, nivelBasura;
	private String msg;
	
	public SacaPuntas() {
		vidaUtilNavaja=new Random().nextInt(4)+97;
		contenedorBasura=250;
		nivelBasura=0;
	}
	
	public boolean SacarPunta(Lapiz lapiz) {
		if(vidaUtilNavaja<30) {
			msg="La navaja no tiene filo...";
			return false;
		}
		if(nivelBasura>=contenedorBasura) {
			msg="El contenedor de basura está lleno";
			return false;
		}
		if( lapiz.getLongLapiz()<20) {
			msg="Al lápiz no se le puede sacar punta, su tamaño es demsiado pequeño";
			return false;
		}
		String tipoMadera=lapiz.getTipoMadera();
		if(tipoMadera.equalsIgnoreCase("Suave")) {
			vidaUtilNavaja -= 1;
			lapiz.setLongLapiz(lapiz.getLongLapiz()-20);
		}
		else {
			if(tipoMadera.equalsIgnoreCase("Mediana")) {
				vidaUtilNavaja -= 3;
				lapiz.setLongLapiz(lapiz.getLongLapiz()-15);
			}
			else {
				vidaUtilNavaja -= 5;
				lapiz.setLongLapiz(lapiz.getLongLapiz()-10);
			}
			
		}
		nivelBasura += 10;
		lapiz.setLongPunta(lapiz.getLongPunta()+10);
		
		
		return true;
	}
	public boolean TirarBasura() {
		if(nivelBasura < contenedorBasura) {
			msg="El contenedor aún no está lleno";
			return false;
		}
		nivelBasura=0;
		return true;
	}
	public boolean CambiarNavaja() {
		if(vidaUtilNavaja>30) {
			msg="La navaja aún sirve";
			return false;
		}
		vidaUtilNavaja=new Random().nextInt(4)+97;
		return true;
	}

	public float getVidaUtilNavaja() {
		return vidaUtilNavaja;
	}

	public void setVidaUtilNavaja(float vidaUtilNavaja) {
		this.vidaUtilNavaja = vidaUtilNavaja;
	}

	public int getNivelBasura() {
		return nivelBasura;
	}

	public void setNivelBasura(int nivelBasura) {
		this.nivelBasura = nivelBasura;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}

