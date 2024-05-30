package bancoAppPKG;


public class Cuenta {
	private String titular;
	private double saldo;
	
	// Constructores
	public Cuenta(String titular) {
		this.titular = titular;
	}
	
	public Cuenta(String titular, int cantidad) {
		this.titular = titular;
		
		if(cantidad < 0) {
			this.saldo = 0;
		} else {
			this.saldo = cantidad;
		}
		
	}
	
	// Métodos GET y SET (getters y setters)
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getCantidad() {
		return saldo;
	}
	
	public void setCantidad(double cantidad) {
		this.saldo = cantidad;
	}

	// Métodos
	
	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			this.saldo += cantidad;
		}
	}
	
	public void extraer(double cantidad) {
		if(this.saldo - cantidad < 0) {
			this.saldo = 0;
		} else {
			this.saldo -= cantidad;
		}
	}
	@Override
	public String toString() {
		return "El titular " + titular + " posee un saldo de $" + saldo ;
	}	
}
