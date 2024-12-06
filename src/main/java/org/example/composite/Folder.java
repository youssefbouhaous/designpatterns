package org.example.composite;
import java.util.ArrayList;
import java.util.List;
class Folder extends Component {
    private List<Component> enfants = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void ajouter(Component component) {
        enfants.add(component);
    }

    public void supprimer(Component component) {
        enfants.remove(component);
    }

    @Override
    public void afficher() {
        System.out.println("Dossier: " + name);
        for (Component enfant : enfants) {
            enfant.afficher();
        }
    }
}
