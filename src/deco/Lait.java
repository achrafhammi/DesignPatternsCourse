package deco;

import produits.Boisson;

public class Lait extends DecorateurBoisson {
    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" with milk";
    }

    @Override
    public double cout(){
        return 2+boisson.cout();
    }
}
