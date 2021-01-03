package Arrays;

import java.io.*;
import java.util.Arrays;

public class CountInversion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\nikhil\\IdeaProjects\\DataStruAlgo\\GeeksSolution\\src\\Arrays\\input.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\nikhil\\IdeaProjects\\DataStruAlgo\\GeeksSolution\\src\\Arrays\\output.txt"));
        solve(br, pw);
        pw.flush();

        System.out.println(pw.checkError());
        pw.close();
        br.close();
    }

    private static void solve(BufferedReader br, PrintWriter pw) throws IOException {
        int n = Integer.parseInt(br.readLine().trim());

        String[] split = br.readLine().split(", ");
        int[] arr = Arrays.stream(split)
                .mapToInt(Integer::parseInt)
                .toArray();
        int count=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j])
                    count++;
            }
        }

        pw.println(count);

    }
}
