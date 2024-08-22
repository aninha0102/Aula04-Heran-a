package entiguy;

public class Corrente extends conta {

	public Corrente(String nome, int numero, double saldo) {
		super(nome, numero, saldo);
		this.limite = limite;
	}
	public String toString() {
		return "corrente" +mostrar()
	 + "limete =" + limite +"";
	}
	
		
}
