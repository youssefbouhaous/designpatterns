package org.example.builder;

import org.example.builder.ordinateur.Desktop;
import org.example.builder.ordinateur.Laptop;
import org.example.builder.ordinateur.Ordinateur;


public class DesktopBuilder implements Builder{
    private String processeur;
    private Integer RAM;
    private Integer stockage;
    @Override
    public DesktopBuilder buildProcesseur(String processeur) {
        this.processeur=processeur;
        return this;
    }
    @Override
    public DesktopBuilder buildRAM(Integer ram) {
        this.RAM=ram;
        return this;
    }
    @Override
    public DesktopBuilder buildStockage(Integer stockage) {
        this.stockage=stockage;
        return this;
    }
    @Override
    public Desktop build() {
        return new Desktop(processeur,RAM,stockage);
    }
}
