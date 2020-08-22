package entities;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double realSalario() {
		return salarioBruto - taxa;
		
	}
	public void SalarioComAumento(double percentage) {
		salarioBruto += salarioBruto * percentage / 100.0;
		
	}
	
	
}
