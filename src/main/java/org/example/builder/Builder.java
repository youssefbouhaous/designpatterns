package org.example.builder;

import org.example.builder.ordinateur.Laptop;
import org.example.builder.ordinateur.Ordinateur;

public interface Builder {
    public Builder buildProcesseur(String p);
    public Builder buildRAM(Integer r);
    public Builder buildStockage(Integer s);
    public Ordinateur build();
}
