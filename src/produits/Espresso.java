package produits;

public class Espresso extends Boisson{

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cout() {
        return 3;
    }
}
