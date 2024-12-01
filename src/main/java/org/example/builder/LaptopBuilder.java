package org.example.builder;

import org.example.builder.ordinateur.Laptop;

public class LaptopBuilder implements Builder{
    private String processeur;
    private Integer RAM;
    private Integer stockage;
    @Override
    public LaptopBuilder buildProcesseur(String processeur) {
        this.processeur=processeur;
        return this;
    }
    @Override
    public LaptopBuilder buildRAM(Integer ram) {
        this.RAM=ram;
        return this;
    }
    @Override
    public LaptopBuilder buildStockage(Integer stockage) {
        this.stockage=stockage;
        return this;
    }
    @Override
    public Laptop build() {
        return new Laptop(processeur,RAM,stockage);
    }

}
