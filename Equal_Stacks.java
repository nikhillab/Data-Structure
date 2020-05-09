import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Equal_Stacks {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size1 = scan.nextInt();
        int size2 = scan.nextInt();
        int size3 = scan.nextInt();

        Queue<Integer> stack1 = new LinkedList<>();
        Queue<Integer> stack2 = new LinkedList<>();
        Queue<Integer> stack3 = new LinkedList<>();
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;

        for (int i = 0; i < size1; i++) {
            int value = scan.nextInt();
            stack1.add(value);
            total1 += value;
        }

        for (int i = 0; i < size2; i++) {
            int value = scan.nextInt();
            stack2.add(value);
            total2 += value;
        }

        for (int i = 0; i < size3; i++) {
            int value = scan.nextInt();
            stack3.add(value);
            total3 += value;
        }

        while (!((total1 == total2) && (total2 == total3) && (total1 == total3))) {
            if (total1 >= total2 && total1 >= total3) {
                total1 -= stack1.remove();
            } else if (total2 >= total1 && total2 >= total3) {
                total2 -= stack2.remove();
            } else {
                total3 -= stack3.remove();
            }
        }
        System.out.println(total1);
    }
}