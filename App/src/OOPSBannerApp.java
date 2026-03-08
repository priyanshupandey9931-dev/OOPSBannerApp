package com.oopsbanner;

public class OOPSBannerApp{
    public static void main(String[] args) {
        printOOPSBanner();
    }

    public static void printOOPSBanner() {
        // UC6: Invoke helper methods during array declaration to build the banner
        String[] bannerLines = {
                buildLine(0),
                buildLine(1),
                buildLine(2),
                buildLine(3),
                buildLine(4)
        };

        // Loop-based rendering system as established in previous UCs
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * UC6 Helper method to construct a single line of the "OOPS" banner
     * @param index The row index (0-4) to retrieve for each character
     */
    public static String buildLine(int index) {
        return String.join("", getO(index), getP(index), getP(index), getS(index));
    }

    // UC6: Encapsulated ASCII patterns for 'O'
    public static String getO(int i) {
        String[] pattern = {" OOOO ", "O    O", "O    O", "O    O", " OOOO "};
        return pattern[i];
    }

    // UC6: Encapsulated ASCII patterns for 'P'
    public static String getP(int i) {
        String[] pattern = {"  PPPP  ", " P   P ", " PPPP  ", " P     ", " P     "};
        return pattern[i];
    }

    // UC6: Encapsulated ASCII patterns for 'S'
    public static String getS(int i) {
        String[] pattern = {"  SSSS  ", " S      ", "  SSS   ", "     S  ", " SSSS   "};
        return pattern[i];
    }
}