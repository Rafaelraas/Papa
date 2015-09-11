package P;

import P.ContaMilhagem;

public class TesteContaMilhagem {

	public static void main(String[] args) {
		int valorDois = 75, valor = 59;
		String cpfDois = "09876542138", cpf = "0123112838";
		Cpf cpff = new Cpf(cpf);
		Cpf cpffDois = new Cpf(cpfDois);
		Cliente cliente = new Cliente(cpff,"K k k", 999, 69, 1);
		Cliente clienteDois = new Cliente(cpffDois, "Rs rs rs", 1000, 13, 0);
		IdentificadorConta idc = new IdentificadorConta(valor);
		IdentificadorConta idcDois = new IdentificadorConta(valorDois);
		ContaMilhagem cm = new ContaMilhagem(idc, cliente);
		ContaMilhagem cmDois = new ContaMilhagem(idcDois, clienteDois);
		
		
		cm.creditar(100000000);
		cm.debitar(1);
		System.out.println("Saldo: " + cm.getSaldo() + "\nCliente: " + cm.getCliente());
		
		cm.transferir(9999999, cmDois);
		System.out.println("Saldo: " + cm.getSaldo() + "\nCliente: " + cm.getCliente() + 
						   "\n\nSaldo: " + cmDois.getSaldo() + "\nCliente: " + cmDois.getCliente());
		cm.desativar();
		cmDois.desativar();
		cm.reativar();
		System.out.println("Conta: " + cm.getCliente() + "Status: " + cm.getStatus() + 
						   "\n\nConta: " + cmDois.getCliente() + "Status: " + cmDois.getStatus());
	}

}
