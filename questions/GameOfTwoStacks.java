package questions;
/*
    Not submitted

 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class GameOfTwoStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int sum = sc.nextInt();
            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            for (int i = 0; i < m; i++) {
                b.add(sc.nextInt());
            }

            System.out.println(twoStacks(sum, a, b));
        }
    }

    public static int twoStacks(int maxSum, List<Integer> aa, List<Integer> bb) {
        // Write your code here

        int[] a = new int[aa.size()];
        int[] b = new int[bb.size()];

//        Copying list elements into an array to make call easy
        for (int i = 0; i < aa.size(); i++) {
            a[i] = aa.get(i);
        }

        for (int i = 0; i < bb.size(); i++) {
            b[i] = bb.get(i);
        }

        return helper(maxSum, a, b, 0, 0) - 1;

    }

    public static int helper(int x, int[] a, int[] b, int sum, int count) {
//        Sequence of sequence type problem

        if (sum > x) {
            return count;
        }

        if (a.length == 0 || b.length == 0) {
            return count;
        }

        int ansA = helper(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ansB = helper(x, a, Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);
        return Math.max(ansA, ansB);

    }
}
