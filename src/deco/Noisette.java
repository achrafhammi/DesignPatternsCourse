package deco;

import produits.Boisson;

public class Noisette extends DecorateurBoisson {
    public Noisette(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" with noisette";
    }

    @Override
    public double cout(){
        return 2.5+boisson.cout();
    }
}
