package bancoAppPKG;

public class BancoApp {

	public static void main(String[] args) {

		Cuenta cuenta1 = new Cuenta("Kehian");
		Cuenta cuenta2 = new Cuenta("Jose", 500);
		
		cuenta1.ingresar(2500);
		cuenta2.ingresar(150);
		
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		
		cuenta1.extraer(750.5);
		cuenta2.extraer(200.3);
		
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		
		cuenta1.setCantidad(1900.1);
		
		System.out.println(cuenta1.getCantidad());
	}

}
