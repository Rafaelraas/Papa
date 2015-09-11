package P;

//add os coments

public class RepositorioCliente {
	private Cliente[] clientes;
	private int qtd;
	
	public RepositorioCliente(){
		clientes = new Cliente[150];
		qtd=0;
	}
	
	public void incluir(Cliente novo){
		if(qtd < clientes.length){
			if(buscar(novo) == null){
				clientes[qtd] = novo;
				qtd++;
				System.out.println("Cliente cadastrado com sucesso.\n");
			}else{
				System.err.println("Cliente já cadastrado.\n");
			}
		}else{
			System.err.println("Lista lotada.\n");
		}
	}
	
	//TODO buscar por todos
	
	public Cliente buscar(Cliente k){
		Cliente c = null;
		for(int i=0;i<qtd;i++) {
			if (k.equals(clientes[i])) {
				c = clientes[i];
				break;
			}
		}
		if (c != null) {
			return c;
		}
		System.err.println("Cliente não cadastrado.\n");

		return c;
	}
	
	public boolean excluir(Cliente k){
		boolean t = false;
		for(int i=0;i<qtd;i++){
			if(k.equals(clientes[i])){
				clientes[i] = clientes[qtd];
				clientes[qtd] = null;
				System.out.println("Exlusão feita com sucesso.\n");
				qtd--;
				t = true;
				break;
			}
			
		}if(!t){
			System.err.println("Cliente não cadastrado.\n"
					+ "Não é possível excluir\n");
		 }
		return t;
	}
	
	public boolean alterar(Cliente antigo, Cliente novo){
		if(this.excluir(antigo)){
			this.incluir(novo);
			return true;
		}
		return false;
	}
	
	/*public void alterar(Cliente k, Cliente x){
		for(int i=0;i<qtd;i++){
			if(k.equals(clientes[i])){
				clientes[i] = k;
				System.out.println("Alteração feita com sucesso.\n");
			}else
				System.err.println("Não é possível alterar.\n"
						+ "Cliente não cadastrado.\n");
		}
	}*/	
}
