package org.example.Creational.Factory;

import org.example.Creational.PaymentFactory;

public class ClientCode {
    public static void main(String[] args){
        Payment p = PaymentFactory.getInstance("UPI");
        p.pay();

        Payment p1 = PaymentFactory.getInstance("CreditCard");
        p1.pay();
    }
}
