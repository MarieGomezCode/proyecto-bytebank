package proyecto.bytebank;

public class TestReferencia {
		public static void main(String[] args) {
			Cuenta primeraCuenta = new Cuenta();
			//primeraCuenta.Saldo = 200;
			//System.out.println(primeraCuenta.Saldo);
			
			Cuenta segundaCuenta = primeraCuenta;//Si ponemos el new ya diferencia la instancia
			//segundaCuenta.Saldo = 100;
			//System.out.println("primera " + primeraCuenta.Saldo);
			//System.out.println("segunda " + segundaCuenta.Saldo);
			//segundaCuenta.Saldo += 400;
			//System.out.println("primera " + primeraCuenta.Saldo);
			System.out.println(primeraCuenta);//Cadena alfanumerica de ubicaion de la memoria de esto
			System.out.println(segundaCuenta);
			if (primeraCuenta == segundaCuenta) {//Java evalua ubicacion en memoria que tiene cada objeto
				System.out.println("Son el mismo objeto");
			}else {
				System.out.println("Son difeentes");
			}
			
		}
}
//En esto caso la emoria almacenaba la misma variable de dos instancias
//Igual si diferentes instancias tuvieran igual valor de un atributo esta no la iguala ya que que se cetra en el objeto no en un atributo especifico de un objeto