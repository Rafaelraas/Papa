package P;

//falta buscar por chave ou todos
//editar os sysos
//add comentarios

public class RepositorioContaMilhagem {
	private ContaMilhagem[] conta;
	private int qtd;
	
	public RepositorioContaMilhagem(){
		conta = new ContaMilhagem[150];
		qtd=0;
	}
	
	public void incluir(ContaMilhagem novo){
		if(qtd < conta.length){
			if(buscar(novo) == null){
				conta[qtd] = novo;
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
	
	public ContaMilhagem buscar(ContaMilhagem k){
		ContaMilhagem c = null;
		for(int i=0;i<qtd;i++){
			if(k.equals(conta[i])){
				c = conta[i];
				break;
			}
			else if(c==null){
				System.err.println("Cliente não cadastrado.\n");
			}
		}
		return c;
	}
	
	public boolean excluir(ContaMilhagem k){
		boolean t = false;
		for(int i=0;i<qtd;i++){
			if(k.equals(conta[i])){
				conta[i] = conta[qtd];
				conta[qtd] = null;
				System.out.println("Exlusão feita com sucesso.\n");
				qtd--;
				t = true;
				break;
			}
			
		}if(t==false){
			System.err.println("Cliente não cadastrado.\n"
					+ "Não é possível excluir\n");
		 }
		return t;
	}
	
	public boolean alterar(ContaMilhagem antigo, ContaMilhagem novo){
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
