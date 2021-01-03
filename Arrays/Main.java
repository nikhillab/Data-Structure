package Arrays;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}

class Solution {
    int getMinDiff(int[] arr, int n, int k) {

        Arrays.sort(arr);

        n = arr.length;
        int result = arr[n - 1] - arr[0];
        for (int i = 1; i < n; ++i) {
            final int min = Math.min(arr[0] + k, arr[i] - k);
            final int max = Math.max(arr[n - 1] - k, arr[i - 1] + k);
            result = Math.min(result, max - min);
        }
        return result;
    } 
}
