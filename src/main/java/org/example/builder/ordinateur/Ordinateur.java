package org.example.builder.ordinateur;

public class Ordinateur {
    protected String processeur;
    protected Integer ram;
    protected Integer stockage;

    public Ordinateur(String processeur, Integer RAM, Integer stockage) {
        this.processeur = processeur;
        this.ram = RAM;
        this.stockage = stockage;
    }
    @Override
    public String toString() {
        return this.getClass().toString()+ "{" +
                "processeur='" + processeur + '\'' +
                ", ram=" + ram +
                ", stockage=" + stockage +
                '}';
    }
}
