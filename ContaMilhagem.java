package P;

//add os coments

public class ContaMilhagem {

	private IdentificadorConta identificador;
	private Cliente cliente;
	private int saldo;
	private boolean ativo;

	public boolean getStatus(){
		return ativo;
	}
	
	public int getSaldo(){
		return saldo;
	}
	
	public Cliente getCliente(){
		return cliente;
	}
	
	public void creditar(int valor){
	this.saldo += valor;
	}

	public void debitar(int valor){
	this.saldo -= valor;
	}


	public void transferir (int valor, ContaMilhagem conta){
	this.debitar(valor);
	conta.creditar(valor);
	}

	public void desativar(){
	this.ativo = false;
	}

	public void reativar(){
	this.ativo = true;
	}

	public ContaMilhagem ( IdentificadorConta id, Cliente cliente){
	this.identificador = id;
	this.cliente = cliente;
	this.saldo = 0;
	this.ativo = true;
	}

	
}
