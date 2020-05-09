import java.math.BigInteger;
import java.util.Scanner;

public class MaxMIn {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] a) {
        BigInteger sum = new BigInteger("0");
        BigInteger max = new BigInteger("0");
        BigInteger min = new BigInteger("9999999999999999999999999");
        for (int i = 0; i < 5; i++) {
            sum = sum.add(BigInteger.valueOf(a[i]));


        }
        for (int i = 0; i < 5; i++) {
            min=min.min(BigInteger.valueOf(a[i]));
            max=max.max(BigInteger.valueOf(a[i]));

        }
//        System.out.println(max);
//        System.out.println(min);
        System.out.print(sum.subtract(max)+" ");
        System.out.print(sum.subtract(min));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

