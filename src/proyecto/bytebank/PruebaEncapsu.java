package proyecto.bytebank;

public class PruebaEncapsu {
public static void main(String[] args) {
	Cuenta cuenta = new Cuenta();
	Cliente cliente = new Cliente();
	//Cliente.setNombre("Diego");
	//Cliente.setDocumento("dfdfdfd");
	cuenta.setTitular(cliente);
	
	//Cliente titular = cuenta.getTitular();
	System.out.println(cliente.getNombre());
	//System.out.println(cuenta.getTitular().getNombre);
 }
}

//Desa opcion whatsapp para img descargadas
