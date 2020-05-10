package com.dsa;/*package whatever //do not write package name here */

import java.util.Scanner;

class RainWaterTrap {
    public static long waterTrap(long[] arr) {
        long water = 0, lmax = arr[0], rmax = arr[arr.length - 1];
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < lmax)
                    lmax = arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > rmax)
                    rmax = arr[j];
            }
            water += Math.max(lmax, rmax) - arr[i];
        }
        return water;
    }

    public static void main(String[] args) {

    }
}