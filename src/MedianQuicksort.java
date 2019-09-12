import java.util.Random;
import java.util.Arrays;

public class MedianQuicksort {
    public static int k = 10;
    //we tested several values of k and around 10 seems to be pretty efficient.
    // Putting k at 100 does not increase efficiency, but putting it at less than 10 decreases efficiency.


    public static void medianQuicksortFunction(TestInteger[] A, int p, int r){
        if(p < r) {
            int q = Partition(A, p, r);
            medianQuicksortFunction(A, p, q - 1);
            medianQuicksortFunction(A, q + 1, r);
        }
    }

    private static int Partition(TestInteger[] A, int p, int r) {
        int i = p - 1;
        TestInteger temp;

        if((r-p) > k) {
            Random rint = new Random();
            int a;
            int b;
            int c;
            int median;
            a = rint.nextInt(r - p + 1) + p;
            b = rint.nextInt(r - p + 1) + p;
            c = rint.nextInt(r - p + 1) + p;

            if (A[a].compareTo(A[b]) > 0) {
                if (A[b].compareTo(A[c]) > 0) {
                    median = b;
                } else if (A[a].compareTo(A[c]) > 0) {
                    median = c;
                } else {
                    median = a;
                }
            } else {
                if (A[a].compareTo(A[c]) > 0) {
                    median = a;
                } else if (A[b].compareTo(A[c]) > 0) {
                    median = c;
                } else {
                    median = b;
                }
            }

            temp = A[r];
            A[r] = A[median];
            A[median] = temp;
        }

        TestInteger x = A[r];

        for (int j = p; j <= r - 1; j ++) {
            if (A[j].compareTo(x) <= 0) {
                i = i + 1;
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;

            }
        }
        temp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = temp;
        return i + 1;
    }


}
