package fs;

public abstract class Composante {
    protected String name;
    protected int level;

    public Composante(String name) {
        this.name = name;
    }

    public abstract void afficher();

    public String getTab(){
        String tab = "";
        for(int i=0; i<level;i++){
            tab+="\t";
        }
        return tab;
    }
}
