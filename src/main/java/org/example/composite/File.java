package org.example.composite;

class File extends Component {
    public File(String name) {
        super(name);
    }

    @Override
    public void afficher() {
        System.out.println("Fichier: " + name);
    }
}
