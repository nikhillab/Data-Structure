package com.dsa;

import java.math.BigInteger;
import java.util.Arrays;

public class  ArraySorted{
    static  int A[];
    public ArraySorted(){
        this.A=new int [2];
    }
    public  void Binary(int n){
        if(n<1)
        {
//            for (int i:A
//                 ) {
//                System.out.print(i+" ");
//            }
            System.out.println(A);
        }
        else{
            A[n-1]=0;
            Binary(n-1);
            A[n-1]=1;
            Binary(n-1);
        }
    }

//    public static int isArraySorted(int []a,int index){
//        if(a.length==1)
//            return 1;
//        return (a[index-1]<a[index-2]?0:isArraySorted(a,index-1));
//    }

    public static void main(String[] args) {
//            int arr[]={1,2,3,4};
//        System.out.println(isArraySorted(arr,arr.length));
        ArraySorted arr=new ArraySorted();
        arr.Binary(2);
    }
}
