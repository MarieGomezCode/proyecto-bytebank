package proyecto.bytebank;

public class TestReferenClie {
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		//diego.nombre = "Diego";
		//diego.documento = "100673785";
		//diego.telefono = "3212483438";
				
		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.depositar(100);
		
		//cuentaDeDiego.titular = diego;
        cuentaDeDiego.setTitular(diego);
        System.out.println(cuentaDeDiego.getTitular().getNombre());
	}
}
