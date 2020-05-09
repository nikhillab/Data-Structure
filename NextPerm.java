import java.io.IOException;
import java.util.Scanner;

public class NextPerm {

    static String biggerIsGreater(String w) {
        char[] arr = w.toCharArray();
        int i = arr.length - 1;
        // finding p --> i
        while (i > 0 && arr[i - 1] >= arr[i]) {
            i--;
        }
        if (i <= 0) { //System.out.println("Pretty much last one!!");
            return "no answer";
        }
        int j = arr.length - 1;
        while (arr[j] <= arr[i - 1]) {
            j--;
        }
        char temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        j = arr.length - 1;
        while (i < j) {
            char tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
            j--;
            i++;
        }
        String ret = new String(arr);
        return ret;
    }

    // Complete the biggerIsGreater function below.
//    public static String biggerIsGreater(String w) {
//        String res="no answer";
//        char ch[]=w.toCharArray();
//        try{
//        for(int i=ch.length-1;i>=0;i--){
//            if(ch[i] > ch[i-1]){
//               char temp=ch[i];
//               ch[i]=ch[i-1];
//               ch[i-1]=temp;
//               String chr=new String(ch);
//               if(greater(w,chr)){
//                   return chr;
//
//               }
//            }
//        }}catch (Exception e){}
//
//        return  res;
//    }
//    public  static  boolean greater(String w,String x){
//        if(w.compareTo(x)==-1) {
//            return true;
//        }
//            return false;
//    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            System.out.println(biggerIsGreater(w));
//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
//            5
//            ab
//                    bb
//            hefg
//                    dhck
//            dkhc
        }


        scanner.close();
    }
}

