package com.company;

public class Product {
    public String name;
    public double crossSalary;
    public double tax;

    public double NetSalary(){
        return crossSalary - tax;
    }
    public void IncreaseSalary(double percentage){
        this.crossSalary += (percentage * 100);

    }
    
}
