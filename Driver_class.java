package com.dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver_class {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String[] str = read.readLine().trim().split(" ");
            Long a = Long.parseLong(str[0]);
            Long b = Long.parseLong(str[1]);

            System.out.println(new Modulo().sumUnderModulo(a, b));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Modulo {
    public static long sumUnderModulo(long a, long b) {
        long M = 1000000007;
		return (a%M+b%M)%M;
    }
}

