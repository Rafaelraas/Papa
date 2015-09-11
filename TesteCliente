package P;

import P.Cpf;
import P.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		String cpf = "09876543210";
		Cpf cpfDois, cpfUm;
		cpfUm = new Cpf(cpf);
		Cliente c = new Cliente(cpfUm, "Son \"Kakaroto\" Goku", 789, 25, 0);
		System.out.println(c);
				
		cpf = "02548755499";
		cpfDois = new Cpf(cpf);
		c.setNome("Marta Vieira da Silva");
		c.setRenda(c.getRenda()/2);
		c.setIdade(29);
		c.setSexo(1);
		
		System.out.println("\nCpf: " + cpfDois.getCPF() + 
							"\nNome: " + c.getNome() +
							"\nPrimeiro nome: " + c.getPrimeiroNome() +
							"\nUltimo Nome: " + c.getUltimoNome() +
							"\nSalario: " + c.getRenda() +
							"\nIdade: " +  c.getIdade() +
							"\nSexo: " + c.getSexo());

	}

}
