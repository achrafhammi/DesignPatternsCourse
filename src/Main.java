import deco.Chocolate;
import deco.DecorateurBoisson;
import deco.Lait;
import deco.Noisette;
import produits.Boisson;
import produits.Deca;
import produits.Espresso;
import produits.Sumatra;

public class Main {
    public static void main(String[] args) {
        Boisson boisson;
        boisson = new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        boisson = new Chocolate(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        boisson = new Noisette(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

    }
}