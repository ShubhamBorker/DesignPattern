package org.example.Creational.Factory;

public class CreditCardPayment implements Payment{

    @Override
    public void pay(){
        System.out.println("Paid using Credit Card");
    }
}
