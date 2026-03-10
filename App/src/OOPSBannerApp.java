package com.oopsbanner;

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp{

    // Map to store character patterns
    private static Map<Character, String[]> patternMap = new HashMap<>();

    // Function to initialize patterns
    public static void initializePatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    // Function to render banner
    public static void renderBanner(String word) {

        for (int row = 0; row < 5; row++) {

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }

            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        initializePatterns();

        String bannerWord = "OOPS";

        renderBanner(bannerWord);
    }
}