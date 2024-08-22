package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		List<conta> lista = new ArrayList<>();
		System.out.println("bem vindo ao banco do Seduc 1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas contas voce deseja cadastrar?");
		int n = sc.nextInt();
		
		for(int i; i <= n ; i++) {
			System.out.print("Digite c para conta correte ou p para conta poupanca");
			String x = sc.next();
			
			if(x.equals('c')){
					
					System.out.print("Digite o nome do dono da canta" + i);
					String nome = sc.next();
					System.out.print("Digite o numero ");
					int numero = sc.nextInt();
					System.out.print("Digite o salido");
					double saldo = sc.nextDouble();
					System.out.print("Digite o limite");
							
				     lista.add(new poupanca(nome, numero,saldo));	
		}else {
			System.out.print("Digite o nome do dono da canta" + i);
			String nome = sc.next();
			System.out.print("Digite o numero ");
			int numero = sc.nextInt();
			System.out.print("Digite o salido");
			double saldo = sc.nextDouble();
			System.out.print("Digite o limite");
					
		     lista.add(new poupanca(nome, numero,saldo));
		}
		System.out.println(lista);
	}
}
