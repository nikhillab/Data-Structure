import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class QueueOpr {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Deque<Integer> deque= new LinkedList<>();
        int que=scanner.nextInt();
        while(que-->0){
            int query=scanner.nextInt();
            if(query==1){
                deque.add(scanner.nextInt());
            }
            if(query==2){
                deque.pollFirst();
            }
            if(query==3){
                System.out.println(deque.peekFirst());
            }
        }
    }
}
