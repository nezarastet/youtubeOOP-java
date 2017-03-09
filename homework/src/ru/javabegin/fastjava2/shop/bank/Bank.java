package ru.javabegin.fastjava2.shop.bank;

public class Bank {

    private String name;
    private double creditDetails;


    public boolean creditCheck(double creditDetails){
        return true;
    }

    public boolean creditSolution (double creditDetails) {
        return true;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditDetails() {
        return creditDetails;
    }

    public void setCreditDetails(double creditDetails) {
        this.creditDetails = creditDetails;
    }
}

