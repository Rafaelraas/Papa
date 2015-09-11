package P;

//TODO editar os syso
//TODO add os coments

public class RepositorioMovimentoConta {
	private MovimentoConta[] conta;
	private int qtd;
	
	public RepositorioMovimentoConta(){
		conta = new MovimentoConta[150];
		qtd=0;
	}
	
	public void incluir(MovimentoConta novo){
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
	//TODO alterar buscar para buscar por todos
	public MovimentoConta buscar(MovimentoConta k){
		MovimentoConta c = null;
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
	

}
