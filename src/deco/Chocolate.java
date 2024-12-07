package deco;

import produits.Boisson;

public class Chocolate extends DecorateurBoisson {
    public Chocolate(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" with chocolate";
    }

    @Override
    public double cout(){
        return 3+boisson.cout();
    }
}
