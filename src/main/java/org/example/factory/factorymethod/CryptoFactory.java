package org.example.factory.factorymethod;

import org.example.factory.paiment.Crypto;
import org.example.factory.paiment.Paiment;

public class CryptoFactory implements Factory{
    @Override
    public Paiment createFactory() {
        Crypto crypto=new Crypto("crypto",2);
        return crypto;
    }
}
