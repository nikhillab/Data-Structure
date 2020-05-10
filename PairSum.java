package com.dsa;

import java.util.Scanner;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class PairSum {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long arr[] = new long[size];
        long sum = sc.nextLong();
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLong();
        }
        int flag = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (arr[i] + arr[j] == sum && j != i) {
                    System.out.println("YES");
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                break;
        }
        if (flag == 0)
            System.out.println("NO");

    }

}
