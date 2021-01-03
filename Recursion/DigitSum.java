package Recursion;

import java.util.Arrays;

public class DigitSum {
    private static int  digitSum(String num) {
        String[] split = num.split("");
        int sum = Arrays.stream(split)
                .mapToInt(Integer::parseInt)
                .sum();
        return sum;
    }

    private static String  superDigit(String n, int k) {
        String sum=digitSum(n)*k+"";
        if(sum.length()==1)
            return sum;
        else
            return superDigit(sum,1);
    }

    public static void main(String[] args) {
        System.out.println(superDigit("9875", 4));
    }
}
