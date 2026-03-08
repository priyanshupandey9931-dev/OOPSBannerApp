package com.oopsbanner;

public class OOPSBannerApp {
    public static void main(String[] args) {
        printOOPSBanner();
    }

    public static void printOOPSBanner() {
        // UC3: Using String.join() for better memory management
        // Each line is constructed by joining string parts without the '+' operator

        String line1 = String.join("", " OOOO ", "  PPPP  ", "  PPPP  ", "  SSSS  ");
        String line2 = String.join("", "O    O", " P   P ", " P   P ", " S      ");
        String line3 = String.join("", "O    O", " PPPP  ", " PPPP  ", "  SSS   ");
        String line4 = String.join("", "O    O", " P     ", " P     ", "     S  ");
        String line5 = String.join("", " OOOO ", " P     ", " P     ", " SSSS   ");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}