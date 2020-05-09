import java.util.Scanner;
import java.util.Stack;

public class Maximum_Element {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack <Integer>stack =new Stack();
        int test=scanner.nextInt();
        int max=0;
        while(test-->0){
            int query=scanner.nextInt();
            if(query==1){
                int num=scanner.nextInt();
                stack.push(num);
                if(num>max)
                    max=num;
            }
            if(query==2) {
                stack.pop();
                if(stack.empty())
                    max=0;
            }
            if(query==3)
                System.out.println(max);
        }
    }
}
/*10
1 97
2
1 20
2
1 26
1 20
2
3
1 91
3
* */
