/*package whatever //do not write package name here */

import java.util.Arrays;
import java.util.Scanner;

class GFG {
    public static void nextGE(long arr[]) {
        long res[] = new long[arr.length];
        Arrays.fill(res, -1);
        try {

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > arr[i]) {
                        res[i] = arr[j];
                        break;
                    }
                }
            }
        } catch (Exception e) {
        }

        for (long l : res)
            System.out.print(l + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();

            long arr[] = new long[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextLong();

            nextGE(arr);

            System.out.println();

        }
    }
}
