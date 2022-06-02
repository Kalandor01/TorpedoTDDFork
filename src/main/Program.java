package main;

import modell.Palya;
import nezet.TorpedoGUI;

public class Program {

    public static void main(String[] args) {
        new Palya();//.jatekIndito();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TorpedoGUI().setVisible(true);
            }
        });
    }
}
