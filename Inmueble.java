package elecciones;
public class Inmueble {
        
        private String calle;
	private int numero;
	private int piso;
	private String puerta;
	

	
	public void setCalle(String cal) {
		calle = cal;
	}
	public String getCalle() {
		return calle;
	}

	
	public void setNumero(int num) {
		numero = num;
	}

	public int getNumero() {
		return numero;
	}

	
	public void setPiso(int pis) {
		piso = pis;
	}

	public int getPiso() {
		return piso;
	}

	
	public void setPuerta(String pu) {
		puerta = pu;
	}

	public String getPuerta() {
		return puerta;
	}
    
}
