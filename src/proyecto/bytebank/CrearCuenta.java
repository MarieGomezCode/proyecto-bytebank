package proyecto.bytebank;

public class CrearCuenta {
	public static void main(String[] args) {
		//Variable, representcion  = Valor, referencia
		Cuenta primeraCuenta = new Cuenta();//Creando una nueva cuenta(con parentesis indi que es un objeto), primeraCuenta es la instancia del objeto Cuenta
		//primeraCuenta.Saldo = 200;
		//primeraCuenta.pais = "Peru"; No compila
		System.out.println(primeraCuenta.getSaldo());
		
		//primeraCuenta += 100;
		Cuenta segundaCuenta = new Cuenta();//Instancis diferentes
		//segundaCuenta.saldo = 50;
		segundaCuenta.depositar(50);
		
		System.out.println("primera Cuenta tiene " + primeraCuenta.getSaldo());
        System.out.println("segunda Cuenta tiene " + segundaCuenta.getSaldo());

        System.out.println(primeraCuenta.getAgencia());
        System.out.println(primeraCuenta.getNumero());

        System.out.println(segundaCuenta.getAgencia());

        // segundaCuenta.agencia = 146;
        segundaCuenta.setAgencia(146);
        System.out.println("Ahora la segunda cuenta esta en la agencia " + segundaCuenta.getAgencia());

        if(primeraCuenta == segundaCuenta) {
            System.out.println("misma cuenta");
        } else {
            System.out.println("cuentas diferentes");
        }

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
	}
}
