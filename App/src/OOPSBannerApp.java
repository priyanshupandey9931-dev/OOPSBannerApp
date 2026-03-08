package com.oopsbanner;

public class OOPSBannerApp {
    public static void main(String[] args) {
        printOOPSBanner();
    }

    public static void printOOPSBanner() {
        // UC5: Combining declaration and initialization in one statement
        // This removes the need for separate population lines (e.g., bannerLines[0] = ...)
        String[] bannerLines = {
                String.join("", " OOOO ", "  PPPP  ", "  PPPP  ", "  SSSS  "),
                String.join("", "O    O", " P   P ", " P   P ", " S      "),
                String.join("", "O    O", " PPPP  ", " PPPP  ", "  SSS   "),
                String.join("", "O    O", " P     ", " P     ", "     S  "),
                String.join("", " OOOO ", " P     ", " P     ", " SSSS   ")
        };

        // UC5: Utilizing an enhanced for-loop for efficient display
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}