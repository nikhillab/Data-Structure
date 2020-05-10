package com.dsa;

import java.util.Scanner;

class AliceandStrings {
    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        String g = s.next();
        String g1 = s.next();
        char a[] = g.toCharArray();
        char b[] = g1.toCharArray();
        int f = 0;
        try {
            for (int i = 0; i < a.length; i++) {
                if (a[i] > b[i]) {
                    f = 1;
                    break;
                }
            }
        }catch (Exception e){}
            if (f == 1)
                System.out.println("NO");
            else {
                if (a.length != b.length)
                    System.out.println("NO");
                else if (a.equals(b))
                    System.out.println("YES");
                else
                    System.out.println("YES");
            }

    }
}
