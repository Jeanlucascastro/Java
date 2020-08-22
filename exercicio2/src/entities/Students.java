package entities;

public class Students {
    public String nomeDoAluno;
    public double primeiroSemestre;
    public double segundoSemestre;
    public double terceiroSemestre;

    public double mediaFinal() {
        return primeiroSemestre + segundoSemestre + terceiroSemestre;

    }

    public double result() {

        if (mediaFinal() < 60.0) {
            System.out.println("Reprovada ");
            return 60 - mediaFinal();
        } else {
            System.out.println("Aprovada ");
            return 0;


        }
    }
    public String toString() {
    	return nomeDoAluno + ", $" + String.format("%.2f",mediaFinal()) + String.format("%.2f",result());
    	
    }
}