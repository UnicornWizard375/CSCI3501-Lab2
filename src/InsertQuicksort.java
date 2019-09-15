import java.util.Random;
import java.util.Arrays;


public class InsertQuicksort {
public static int k = 10;

    public static void insertQuicksortFunction(TestInteger[] A, int p, int r){
            if (p < r && ((r - p) > k)) {
                int q = Partition(A, p, r);
                insertQuicksortFunction(A, p, q - 1);
                insertQuicksortFunction(A, q + 1, r);
            } else {
                if ((r - p) <= k){
                    insertFunction(A, p, r);
                }
            }
    }

    private static int Partition(TestInteger[] A, int p, int r) {
        TestInteger x = A[r];
        int i = p - 1;
        TestInteger temp;

//        if (r - p > k) {

            for (int j = p; j <= r - 1; j++) {
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
//        }
//        else {
//        insertFunction(A, p, r);
//        return i + 1;
//        }
    }

    private static void insertFunction(TestInteger[] A, int p, int r){
        for(int j= p+1; j < r - p - 1; j++) {
            TestInteger key = A[j];
            int i = j-1;
            while (i >= 0 && (A[i].compareTo(key) > 0)){
                A[i+1] = A[i];
                i = i-1;
            }
            A[i+1] = key;
        }
    }


}