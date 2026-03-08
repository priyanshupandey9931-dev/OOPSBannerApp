package com.oopsbanner;

public class OOPSBannerApp{
    public static void main(String[] args) {
        printOOPSBanner();
    }

    public static void printOOPSBanner() {
        // UC4: Using a String array to store banner lines for modularity
        String[] bannerLines = new String[5];

        // Population using String.join() as established in UC3
        bannerLines[0] = String.join("", " OOOO ", "  PPPP  ", "  PPPP  ", "  SSSS  ");
        bannerLines[1] = String.join("", "O    O", " P   P ", " P   P ", " S      ");
        bannerLines[2] = String.join("", "O    O", " PPPP  ", " PPPP  ", "  SSS   ");
        bannerLines[3] = String.join("", "O    O", " P     ", " P     ", "     S  ");
        bannerLines[4] = String.join("", " OOOO ", " P     ", " P     ", " SSSS   ");

        // UC4: Using an enhanced for-loop for cleaner output traversal
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}