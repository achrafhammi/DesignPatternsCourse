package achraf.computer;

public class Projecteur implements Vga{
    @Override
    public void print(String message) {
        System.out.println("..........Projecteur..........");
        System.out.println(message);
        System.out.println("..........Projecteur..........");

    }
}
