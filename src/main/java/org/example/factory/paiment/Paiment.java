package org.example.factory.paiment;

public class Paiment {
    protected String method;
    protected Integer maxToUse;

    public Paiment(String method, Integer maxToUse) {
        this.method = method;
        this.maxToUse = maxToUse;
    }
    public void displayMethod(){
        System.out.println(this.method);
    }
}
