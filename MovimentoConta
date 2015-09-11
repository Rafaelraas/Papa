package P;

//add os coments

import java.util.Date;

public class MovimentoConta {

	private ContaMilhagem contaO;
	private ContaMilhagem contaD;
	private int valor;
	private int tipo;
	private String nomeFonte;
	private Date data;
		
	public void Data (){
		data = new Date();
	}
	
	public String getNomeExtrato(){
		String s;
		if(contaO.getCliente().getSexo() == 0){
			s = "MR.";
		}
		
		else{
			s = "MRS.";
		}
		
		return "" + contaO.getCliente().getUltimoNome().toUpperCase() + "," + contaO.getCliente().getPrimeiroNome().toUpperCase() + s;
	}
	
	public MovimentoConta(ContaMilhagem contaO, int valor, int tipo, ContaMilhagem contaD, String nomeFonte, Date data){
		this.contaO = contaO;
		this.valor = valor;
		this.tipo = tipo;
		this.contaD = contaD;
		this.nomeFonte = nomeFonte;
		this.data = data;
	}
	
}
