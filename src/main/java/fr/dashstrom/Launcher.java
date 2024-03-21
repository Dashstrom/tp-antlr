package fr.dashstrom;

import fr.dashstrom.gui.LogoApplication;

public class Launcher {

    public static void main(String[] args) {
        try {
            LogoApplication.main(args);
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

}