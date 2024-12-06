package org.example.composite;

abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void afficher();
}
