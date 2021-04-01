package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class StringUtils {

    public static List<String> getStringsWithPoints(String value) {
        List<String> result = new ArrayList<>();

        int maxDotsAmount = value.length() - 1;
        int allCombinationAmount = (int) Math.pow(2, maxDotsAmount);

        for (int i = 0; i < allCombinationAmount; i++) {
            String dotsPosition =
                    String.format("%" + (maxDotsAmount == 0 ? 1 : maxDotsAmount) + "s", Integer.toBinaryString(i))
                            .replace(" ", "0");

            StringBuilder line = new StringBuilder();
            for (int j = 0; j < value.length(); j++) {
                line.append(value.charAt(j)).append(j != maxDotsAmount && dotsPosition.charAt(j) == '1' ? "." : "");
            }

            result.add(line.toString());
        }

        return result;
    }
}