package Arrays;

import java.math.BigInteger;

public class FactorialBIG {
    public static final void bigFactorial(String num){
        BigInteger fac=new BigInteger(num);
        BigInteger res=BigInteger.ONE;
        for (long i=Long.valueOf(num);i>=1;i--) {
                res=res.multiply(BigInteger.valueOf(i));
        }
        System.out.println(res.toString());

    }
    public static void main(String[] args) {
        bigFactorial("5");
    }
}
