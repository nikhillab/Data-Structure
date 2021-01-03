package Arrays;
// A Java program for merging overlapping intervals

import java.util.*;
import java.util.stream.Collectors;

public class MergeOverlappingIntervals {

    // The main function that takes a set of intervals, merges  
    // overlapping intervals and prints the result  
    public static void mergeIntervals(Interval[] arr) {
        // Test if the given set has at least one interval  
        if (arr.length <= 0)
            return;

        Stack<Interval> stack = new Stack<>();

        // sort the intervals in increasing order of start time  
        Arrays.sort(arr);

        // push the first interval to stack  
        stack.push(arr[0]);
        //[1,3],[2,6],[8,10],[15,18]

        // Start from the next interval and merge if necessary  
        for (int i = 1; i < arr.length; i++) {
            // get interval from stack top  
            Interval top = stack.peek();

            // if current interval is not overlapping with stack top,  
            // push it to the stack
            System.out.println(top);
            System.out.println(arr[i]);

            if (top.end < arr[i].start)
                stack.push(arr[i]);

                // Otherwise update the ending time of top if ending of current
                // interval is more
            else if (top.end < arr[i].end) {
                top.end = arr[i].end;
                stack.pop();
                stack.push(top);
            }
        }
ArrayList<Interval> res= new ArrayList<>();
        // Print contents of stack  
        System.out.print("The Merged Intervals are: ");
        while (!stack.isEmpty()) {
            Interval t = stack.pop();
            res.add(t);
            //System.out.print("[" + t.start + "," + t.end + "] ");
        }
        Collections.reverse(res);
        System.out.println(res);
    }

    public static void main(String[] args) {
        //(1,3),(2,4),(6,8),(9,10)
        Interval[] arr = new Interval[4];
        arr[0] = new Interval(1,3);
        arr[1] = new Interval(2,4);
        arr[2] = new Interval(6,8);
        arr[3] = new Interval(9, 10);
        mergeIntervals(arr);


//        ArrayList<Interval> a=new ArrayList<>();
//        a.get(0);
    }
}

class Interval implements Comparable<Interval> {
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
    //sort using starting time of intervals
    @Override
    public int compareTo(Interval o) {
        return this.start-o.start;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}