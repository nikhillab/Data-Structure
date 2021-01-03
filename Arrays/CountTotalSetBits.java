package Arrays;

import java.util.Scanner;

public class CountTotalSetBits {
    static int count(int x) {
        int sum = 0;
        while (x != 0) {
            x = x & (x - 1);
            sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int N = in.nextInt();
            int sum = 0;
            for (int i = 1; i <= N; i++) {
                sum += count(i);
            }
            System.out.println(sum);
        }
    }
}
