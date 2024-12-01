package org.example.factory.factorymethod;

import org.example.factory.paiment.Especes;
import org.example.factory.paiment.Paiment;

public class EsepecesFactory implements Factory{
    @Override
    public Especes createFactory() {
        return new Especes("especes",5);
    }
}
