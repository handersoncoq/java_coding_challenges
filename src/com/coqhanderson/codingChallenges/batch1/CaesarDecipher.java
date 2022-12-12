package com.coqhanderson.codingChallenges.batch1;

import java.util.Scanner;

public class CaesarDecipher {

    public static char cryptIt(char c, int shift) {
        if (!Character.isAlphabetic(c)) return c;
        char base = 'A';
        if (c >= 'a') base = 'a';
        return (char)(((c - base + shift) % 26) + base);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int shift = s.nextInt();

        char[] sArr = str.toCharArray();
        for (int i=0; i<sArr.length; i++) {
            sArr[i] = cryptIt(sArr[i], shift);
        }
        System.out.println(new String(sArr));
    }

}
