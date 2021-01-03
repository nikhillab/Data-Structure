package Arrays;

import java.util.Random;

public class MaxSumSubArray {

    static void BruthFor(int array[]) {
        int best = 0;
        int n = array.length;
        for (int a = 0; a < n; a++) {
            for (int b = a; b < n; b++) {
                int sum = 0;
                for (int k = a; k <= b; k++) {
                    sum += array[k];
                }
                best = Math.max(best, sum);
            }
        }
        System.out.println(best);
    }

    static void second(int array[]) {
        int best = 0;
        int n = array.length;
        for (int a = 0; a < n; a++) {
            int sum = 0;
            for (int b = a; b < n; b++) {
                sum += array[b];
                best = Math.max(best, sum);
            }
        }
        System.out.println(best);
    }

    static void bestSolution(int array[],int n){

        int best = 0, sum = 0;
        for (int k = 0; k < n; k++) {
            sum = Math.max(array[k],sum+array[k]);
            best = Math.max(best,sum);
        }
        System.out.println(best);
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = new Random().nextInt(10);
        }
        System.out.println("Best Solution");
        bestSolution(arr,arr.length);


    }
}
