package com.dsa;

import java.util.Scanner;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class MonkTeachesPalindrome {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            String str = sc.next();
            if (str.equals(new StringBuilder(str).reverse().toString())) {
                if (str.length() % 2 == 0)
                    System.out.println("YES EVEN");
                else
                    System.out.println("YES ODD");
            } else
                System.out.println("NO");
        }

    }
}
