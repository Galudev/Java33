
public class Card {
	private String entidad;
	private String numero;
	private String titular;
	private String caducidad;
	
	private boolean esActiva = false;
	private double saldo = 1000;
	
	public Card(String entidad, String numero, String titular, String caducidad) {
		super();
		this.entidad = entidad;
		this.numero = numero;
		this.titular = titular;
		this.caducidad = caducidad;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(String caducidad) {
		this.caducidad = caducidad;
	}

	public void activar() {
		esActiva = true;
	}
	
	public void anular() {
		esActiva = false;
	}
	
	public void pagar(int precio) {
		if(esActiva) {
			if(saldo>=precio) {
				saldo -= precio;
			} else {
				System.err.println("El saldo es insuficiente");
			}
		} else {
			System.err.println("La tarjeta no está activada");
		}
	}
	
	public void consultarSaldo() {
		System.out.println("El saldo actual es de " + saldo + "€");
	}
}
