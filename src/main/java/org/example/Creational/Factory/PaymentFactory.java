package org.example.Creational.Factory;

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
