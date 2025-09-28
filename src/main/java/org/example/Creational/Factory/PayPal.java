package org.example.Creational.Factory;

public class PayPal implements Payment{

    @Override
    public void pay(){
        System.out.println("Paid using Paypal");
    }
}
