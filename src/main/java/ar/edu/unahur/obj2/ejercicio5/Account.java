package ar.edu.unahur.obj2.ejercicio5;

public class Account {

    private int number;
    private double amount;

    public Account(int number, double amount) {
        this.number = number;
        this.amount = amount;
    }

    public int getNumber() {
        return number;
    }

    public double getAmount() {
        return amount;
    }
}
