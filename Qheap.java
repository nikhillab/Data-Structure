import java.util.Scanner;
import java.util.TreeSet;

public class Qheap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> qheap = new TreeSet<>();
        int test = scanner.nextInt();
        while (test-- > 0) {
            int query = scanner.nextInt();
            if (query == 1) {
                qheap.add(scanner.nextInt());
            }
            if (query == 2) {
                qheap.remove(scanner.nextInt());
            }
            if (query == 3) {
                System.out.println(qheap.first());
            }

        }
    }
}
