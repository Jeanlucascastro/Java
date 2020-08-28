package entities;
//comentando

public class Bank {

	private String holder;
	private int number;
	private double value;
	
	
	public Bank (double value) {
		this.value = value;
	}
	public Bank (String holder, int number) {
		this.holder = holder;
		this.number = number;
	}
	
	public Bank(String holder, int number, double value) {
		this.holder = holder;
		this.number = number;
		this.value = value;
	}

	public double valorTotal() {
		return value;
	}

	public void addValue(double value) {
		this.value += value;
	}
	

	public void removeValue(double value) {
		this.value -= value;
	}

	public String toString() {
		return holder + " Conta " + number + " Saldo " + value;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	
	

}
