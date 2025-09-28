package org.example.Creational;

import org.example.Creational.Factory.CreditCardPayment;
import org.example.Creational.Factory.PayPal;
import org.example.Creational.Factory.Payment;
import org.example.Creational.Factory.UpiPayment;

public class PaymentFactory {
    public static Payment getInstance(String input){
        if(input.trim().equalsIgnoreCase("CreditCard"))
            return new CreditCardPayment();
        else if (input.trim().equalsIgnoreCase("UPI"))
        return new UpiPayment();
        else if (input.trim().equalsIgnoreCase("PayPal"))
            return new PayPal();
        else return null;
    }
}
