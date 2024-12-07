package fs;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Composante {
    private List<Composante> composantes = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void afficher() {
        System.out.println(getTab()+"- Folder: "+name);
        for(Composante c:composantes){
            c.afficher();
        }
    }
    public Composante add(Composante c){
        composantes.add(c);
        c.level = level+1;
        return c;
    }
}
