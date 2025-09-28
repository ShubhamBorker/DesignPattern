package org.example.Creational.Factory;

public class UpiPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Paid using UPI");
    }
}
