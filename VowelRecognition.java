package com.dsa;

import java.util.Scanner;

public class VowelRecognition {
    //public  static  long sum=0;
    public static int countVowel(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                sum++;
            }
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test-- > 0) {
            int res = 0;
            String str = scanner.next();
            for (int i = 0; i < str.length(); i++) {
                for (int j = i; j < str.length(); j++) {
                    int sum = countVowel(str.substring(i, j + 1));
                    res = res + sum;
                }
            }
            System.out.println(res);
        }
    }
}
