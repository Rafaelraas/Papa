package P;

import java.util.Scanner;
import P.IdentificadorConta;

public class TesteIdentificadorConta {

	public static void main(String[] args) {
		
		IdentificadorConta id;								//Declaraçao dos atributos
		int dig;
		long numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero da conta: ");
		numero = sc.nextLong();
		id = new IdentificadorConta(numero);
		
		System.out.println("Numero da conta:" + id.getNumero() +
		"\n" + "Digito verificador: " + id.calcularDigitoVerificador(id.getNumero())+
		"\n" + "Status: " + id.verificarValidadeDigito(id.calcularDigitoVerificador(id.getNumero())) + "\n\n");
		
		System.out.println("Insira o numero da conta: ");
		numero = sc.nextLong();
		id.setNumero(numero);
		id.calcularDigitoVerificador(numero);
		System.out.println("Digite o digito verificador: ");
		dig = sc.nextInt();
		System.out.println("Status: " + id.verificarValidadeDigito(dig));
		sc.close();
	}

}
