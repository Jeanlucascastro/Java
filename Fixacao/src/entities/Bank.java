package entities;



public class Bank {
	
	public int number;
	public String holder;
	public double value;
	
	public double valorTotal () {
		return value;
	}
	
	public void addValue (double value) {
		this.value += value;
	}
	
	public void removeValue (double value) {
		this.value -= value;
	}
	
	

}