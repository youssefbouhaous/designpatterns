package org.example.factory.factorymethod;

import org.example.factory.paiment.Carte;
import org.example.factory.paiment.Paiment;

public class CarteFactory implements Factory{
    @Override
    public Paiment createFactory() {
        Carte carte=new Carte("carte",50);
        return carte;
    }
}
