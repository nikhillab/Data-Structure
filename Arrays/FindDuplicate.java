package Arrays;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicate {
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
        int n=Integer.parseInt(br.readLine().trim());
        //System.out.println(n);
        String[] split = br.readLine().split(", ");
        int[] arr = Arrays.stream(split)
                .mapToInt(Integer::parseInt)
                .toArray();
        findDuplicate(arr,pw);
//        int duplicate = findDuplicate(arr);
//        pw.println("Using leetCode"+duplicate);
    }
        //for n-1
    private static void findDuplicate(int[] arr, PrintWriter pw){
        int n=arr.length;
        for (int i = 0; i <n ; i++) {
            int ind= (arr[i]%n);
            arr[ind]=arr[ind]+n;
        }

        for (int i = 0; i < n; i++) {
            if ((arr[i] / n) >= 2)
                pw.println("From Permuntation : "+i);
        }
    }

    //from leetcode n+1
    public static int findDuplicate(int[] nums) {
        while (nums[nums[0]]!=nums[0]) {
            int temp = nums[0];
            nums[0]=nums[nums[0]];
            nums[temp]=temp;
        }
        return nums[0];
    }
}
