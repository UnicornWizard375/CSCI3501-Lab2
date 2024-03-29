import java.util.Random;
import java.util.Arrays;

public class SortingAnalysis2ElectricBoogaloo {

    public static void quickSort2ElectricBoogaloo(TestInteger[] A, int p, int r){
        if(p < r) {
           int q = Partition(A, p, r);
           quickSort2ElectricBoogaloo(A, p, q - 1);
           quickSort2ElectricBoogaloo(A, q + 1, r);
        }
    }

    private static int Partition(TestInteger[] A, int p, int r) {
        TestInteger x = A[r];
        int i = p - 1;
        TestInteger temp;

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
