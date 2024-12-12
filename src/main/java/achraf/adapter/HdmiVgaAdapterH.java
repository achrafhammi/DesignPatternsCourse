package achraf.adapter;

import achraf.computer.HDMI;
import achraf.computer.TV;
import achraf.computer.Vga;

public class HdmiVgaAdapterH extends TV implements Vga{
    @Override
    public void print(String message) {
        System.out.println("*************** adapter ************");
        super.view(message.getBytes());
        System.out.println("*************** / adapter ************");
    }
}
