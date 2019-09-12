import java.util.Random;
import java.util.Arrays;

public class RandomizedQuicksort {

    public static void randomQuicksortFunction(TestInteger[] A, int p, int r){
        if(p < r) {
            int q = Partition(A, p, r);
            randomQuicksortFunction(A, p, q - 1);
            randomQuicksortFunction(A, q + 1, r);
        }
    }

    private static int Partition(TestInteger[] A, int p, int r) {
        Random rand = new Random();
        int y;
        y = rand.nextInt(r - p + 1) + p;
        int i = p - 1;
        TestInteger temp;

        temp = A[r];
        A[r] = A[y];
        A[y] = temp;
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

