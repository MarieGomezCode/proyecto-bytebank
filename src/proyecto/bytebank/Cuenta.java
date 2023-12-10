//Entidad cuenta:
//		Saldo
//		Agencia
//		Numero
//		Titular
package proyecto.bytebank;

public class Cuenta {//Agrupacion de varios tipos de datos, private hace que nadie pueda acceder al atributo por lo eso todo donde halla saldo se pone en rojo
	private double	Saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;
	public Cuenta() {
		
	}
	
		public Cuenta (int agencia) {//Contructor con parametros, osea personalizado
			
			if(agencia >= 0) {
				System.out.println("No se permite 0");
			}else {
				this.agencia = agencia;
			}
			total++;
			
			System.out.println("Se va creando esto de cuenta" + total);
		 }

	//NO retorn valor
	public void depositar(double valor){//ingersar parametros
		//Esta cuenta      Esta Cuenta
		//This account      This account
		//This object
		this.Saldo    = this.Saldo + valor;
		//this.Saldo += valor;
	}//Muy importante el scope , el alcanse llaves
	//Retorna valor
	public boolean retirar(double valor) {
		if(this.Saldo >= valor) {
			this.Saldo -= this.Saldo;
			//This.Saldo -= valor;
			return true;
		}
		return false;
	}
	public boolean transferir(double valor, Cuenta destino) {
		if (this.Saldo >= valor) {
			this.Saldo -= this.Saldo;
			
			destino.depositar(valor);
			return true;
		}else {
			return false;
		}
	}
	public double getSaldo(){
		return this.Saldo;
	}
	public void setAgencia(int agencia){
			this.agencia = agencia;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
	//Algo que sea como exito o error usamos boolean
}
//El metodo void no espera retornar nada

































