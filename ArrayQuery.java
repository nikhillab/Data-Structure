import java.util.Scanner;

public class ArrayQuery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        s = s.replaceAll(" ", "");
        StringBuilder str = new StringBuilder(s);
        // System.out.println(str.toString());
        //System.out.println(s);
        // System.out.println(str.charAt(2));
        for (int i = 0; i < m; i++) {
            int k = scanner.nextInt();
            int l = scanner.nextInt();
            int j = scanner.nextInt();
            if (k == 1) {
                String str2 = str.substring(l - 1, j);
                str.delete(l - 1, j);
                str.insert(0, str2);
                //System.out.println(str2);
                // System.out.println(str);
            }
            if (k == 2) {
                String str2 = str.substring(l - 1, j);
                str.delete(l - 1, j);
                str.append(str2);
                //System.out.println(str2);
                //System.out.println(str);
            }

        }
        char[] res = str.toString().toCharArray();
        int diff = Math.abs(Integer.parseInt("" + res[0]) - Integer.parseInt("" + res[res.length - 1]));
        System.out.println(diff);

    }
}
