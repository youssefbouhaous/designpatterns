package org.example.factory;

import org.example.factory.paiment.*;

public class SimpleFactory {
    private Paiment paiment;
    public Paiment initPaiement(String method){
        if(method.equals("carte")){
            paiment=new Carte("carte",50);
        }
        else if(method.equals("paypal")){
            paiment=new PayPal("paypal",100);
        }
        else if(method.equals("especes")){
            paiment=new Especes("especes",10);
        } else if (method.equals("crypto")) {
            paiment=new Crypto("crypto",2);
        }
        return paiment;
    }
}
