package Recursion;

public class PowerSum {
    static int powerSum(int X, int N) {
        int upto = (int) (Math.pow(X, 1.0 / N)) + 1;
        int[] arr = new int[X + 1];
        arr[0] = 1;
        for (int index = 1; index <= upto; ++index) {
            int pow = (int) Math.pow(index, N);
            for (int j = X; j >= pow; j--) {
                arr[j] += arr[j - pow];
            }
        }
        return arr[X];
    }
// 100= 10^2,and also other so that we can get 100 by adding
    public static void main(String[] args) {
        System.out.println(powerSum(100, 2));
        System.out.println(powRec(1, 100, 2));
    }
    private static int powRec(int num,int x,int power){
      int var=(int)  Math.pow(num,power);
      if(var<x)
          return powRec(num+1,x,power)+powRec(num+1,x-var,power);
      if(var==x)
          return 1;
      else
          return 0;
    }
}

