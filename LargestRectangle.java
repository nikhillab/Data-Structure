package com.dsa;


import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class LargestRectangle {

    // Complete the largestRectangle function below.
    static long largestRectangle(int[] a) {
        Stack<Integer> stack = new Stack<>();
        if (a == null || a.length == 0)
            return 0;
        long maxArea = 0;
        int i = 0;
        while (i < a.length) {
            if (stack.empty() || a[stack.peek()] <= a[i])
                stack.push(i++);
            else {
                int top = stack.pop();
                maxArea = Math.max(maxArea, a[top] * (stack.empty() ? i : i - stack.peek() - 1));
            }
        }
        while (!stack.empty()) {
            int top = stack.pop();
            maxArea = Math.max(maxArea, a[top] * (stack.empty() ? i : i - stack.peek() - 1));
        }
        return maxArea;
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] h = new int[n];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        long result = largestRectangle(h);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }


    public void reverse(String str){
        //your code here
        System.out.println(new StringBuilder(str).reverse().toString());
    }
}
