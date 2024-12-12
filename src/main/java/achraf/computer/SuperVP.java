package achraf.computer;

public class SuperVP implements Vga, HDMI{
    @Override
    public void view(byte[] data) {
        System.out.println("------------------- SUPER VP HDMI-----------------");
        System.out.println(new String(data));
        System.out.println("------------------- SUPER VP HDMI-----------------");

    }

    @Override
    public void print(String message) {
        System.out.println("------------------- SUPER VP VGA-----------------");
        System.out.println(message);
        System.out.println("------------------- SUPER VP VGA-----------------");
    }
}
