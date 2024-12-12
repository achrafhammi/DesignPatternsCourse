package achraf.adapter;

import achraf.computer.HDMI;
import achraf.computer.TV;
import achraf.computer.Vga;

public class HdmiVgaAdapter implements Vga {
    private HDMI hdmi;
    @Override
    public void print(String message) {
        System.out.println("*************** adapter ************");
        hdmi.view(message.getBytes());
        System.out.println("*************** / adapter ************");
    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
