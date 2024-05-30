package password;

public class Password {
	
	private String contraseña;
	private int longitud;
	private final static int LARGO = 8;
	
	
	public Password() {
	}

	public String getContraseña() {
		return contraseña;
	}
	
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public int getLongitud() {
		return longitud;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public String generarContraseña () {
		
		String password = "";
		
		for (int i = 0; i < LARGO; i++) {
			int eleccion = ((int)Math.floor(Math.random() * 3 + 1 )); // El CAST nos da la posibilidad de convertir un tipo de dato en otro
			
			if (eleccion == 1) {                                       
				char minusculas = (char)((int)Math.floor(Math.random() * (123 - 97) + 97));
				password += minusculas;
				
			} else {
				
				if (eleccion == 2) {	
					char mayusculas = (char)((int)Math.floor(Math.random() * (91 - 65) + 65));
					password += mayusculas;
					
				} else {
					char numeros = (char)((int)Math.floor(Math.random() * (58 - 48) + 48));
					password += numeros;
					
				}
			}
		}
		
		return password;	
	}
}
