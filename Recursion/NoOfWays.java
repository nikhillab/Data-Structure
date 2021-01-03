package Recursion;

/*
    Find no of ways that N person can go either alone OR in pair
        if n=2
        let AB
        (A),(B),(AB)
        n=3->>(a,b,c),(ab,c),(bc,a),(ac,b)
*/
public class NoOfWays {

    public static final int noOfWays(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        return noOfWays(n-1)+((n-1)*noOfWays(n-2));

    }
    public static void main(String[] args) {
        System.out.println(noOfWays(3));
    }
}
