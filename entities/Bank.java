package entities;



public class Bank {

    public String holder;
    public int number;
    public double value;

    public Bank(String holder,int number , double value){
        this.holder = holder;
        this.number = number;
        this.value = value;
    }

    public double valorTotal () {
        return value;
    }

    public void addValue (double value) {
        this.value += value;
    }

    public void removeValue (double value) {
        this.value -= value;
    }

    public String toString (){
        return holder + " Conta " + number +  " Saldo " + value;
    }

}