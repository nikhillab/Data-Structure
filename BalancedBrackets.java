package com.dsa;

import java.util.ArrayDeque;
import java.util.Scanner;

class BalancedBrackets {
    public static String Bala(String s) {
        String res = "NO";
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[')
                stack.push(ch);
            else {
                if (!stack.isEmpty()) {
                    char pop = stack.pop();
                    if (ch == '}' && pop == '{')
                        res = "YES";
                    else if (ch == ']' && pop == '[')
                        res = "YES";
                    else if (ch == ')' && pop == '(')
                        res = "YES";
                    else
                        return res = "NO";
                } else
                    return res = "NO";

            }
        }
            if(!stack.isEmpty())
                res="NO";

        return res;
    }

    public static void main(String args[]) throws Exception {


        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            String str = sc.next();
            System.out.println(Bala(str));
        }

    }

}
