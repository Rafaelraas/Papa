package P;

public class Cpf {

	private String cpf;
	
	public Cpf(String cpf) {
		if (validarCPF(cpf) == true) {
			this.cpf = cpf;
		} else {
			System.out.println("CPF invalido!");
		}
	}
		
	public String getCPF() {
		return this.cpf;
	}
	
	public boolean validarCPF(String s) {
		// TODO implementar regra de validacao do digito
		if (s.length() >= 9 && s.length() <= 12)
			return true;
		else 
			return false;
	}
}
