package org.example.factory.factorymethod;

import org.example.factory.paiment.PayPal;

public class PayPalFactory implements Factory{
    @Override
    public PayPal createFactory() {
        PayPal payPal=new PayPal("paypal",33);
        return payPal;
    }
}
