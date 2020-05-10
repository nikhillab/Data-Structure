package com.dsa;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreatestElement {

    public static void nextGE(long arr[]){
        long res[]=new long[arr.length];
        Arrays.fill(res,-1);
        try{

            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]>arr[i]){
                        res[i]=arr[j];
                        break;
                    }
                }
            }
        }catch(Exception e){}

        for(long l:res)
            System.out.print(l+" ");
    }
    public static void nextGreatStack(long arr[]){
        Stack<Long> stack= new Stack<>();
        stack.push(arr[0]);
        for(int i=1;i<arr.length;i++){

            if(stack.empty()){
                stack.push(arr[i]);
                continue;
            }

            while(stack.empty()==false && stack.peek()<arr[i]){
                    System.out.print(arr[i]+" ");
                    stack.pop();

            }
            stack.push(arr[i]);
        }

        while (stack.empty()==false) {
            System.out.println("-1 ");
            stack.pop();
        }

    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        while(test-->0){
            int n=sc.nextInt();

            long arr[]=new long [n];

            for(int i=0;i<n;i++)
                arr[i]=sc.nextLong();
            //nextGE(arr);
            nextGreatStack(arr);

            System.out.println();

        }
    }
}
//2
//        4
//        1 3 2 4
//1
//        4
//        7 8 1 4

//        4
//        4 3 2 1