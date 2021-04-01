package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> result = StringUtils.getStringsWithPoints("abcdegfhij");
        int count = 0;
        for (String line : result) {
            count++;
            System.out.println(line);
        }
        System.out.println(count);

    }
}
