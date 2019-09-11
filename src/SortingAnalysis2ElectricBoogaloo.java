import java.util.Random;
import java.util.Arrays;

public class SortingAnalysis2ElectricBoogaloo {
    public static void main(String[] args) {
        int length = 10000;
        TestInteger[] timSortArray = new TestInteger[length];
        TestInteger[] quickSortArray = new TestInteger[length];
        TestInteger counter = new TestInteger();

        for(int x = 0; x < length; x++){
             TestInteger temp = GenerateTestIntegers();
            timSortArray[x] = temp;
            quickSortArray[x] = temp;
        }


        //uncomment these out if you want the array to be pre-sorted. (where there are multiple sequences of sorted numbers, but the whole list isn't sorted yet)
        //sortedPresort(quickSortArray, timSortArray, length);
        //presort10(quickSortArray, timSortArray);
        presort100(quickSortArray, timSortArray);


        quickSort2ElectricBoogaloo(quickSortArray, 0, length-1);
        System.out.println("Is quickSort sorted? " + isSorted(quickSortArray));
        System.out.println("Number of comparisons for quick sort: " + counter.getCounter());

        //this clears the variable we use to count the comparisons
        counter.getCounter();

        Arrays.sort(timSortArray);
        System.out.println("Is timSort sorted? " + isSorted(timSortArray));
        System.out.println("Number of comparisons for tim sort: " + counter.getCounter());

    }
    //This is for pre-sorted list
    public static void sortedPresort(TestInteger[] quickSortArray, TestInteger[] timSortArray, int length) {
        for (int x = 0; x < length; x++) {
            TestInteger temp = new TestInteger();
            temp.value = x;
            timSortArray[x] = temp;
            quickSortArray[x] = temp;
        }
        TestInteger temp2 = new TestInteger();
        temp2.getCounter();
    }


    //This was added for the 10 sequences of 1000 tests
        public static void presort10(TestInteger[] quickSortArray, TestInteger[] timSortArray) {
            for (int x = 0; x < 10; x++) {
                quickSort2ElectricBoogaloo(quickSortArray, x * 1000, (x + 1) * 1000 - 1);
                quickSort2ElectricBoogaloo(timSortArray, x * 1000, (x + 1) * 1000 - 1);
            }

            TestInteger temp = new TestInteger();
            temp.getCounter();
        }




    //This was added for the 100 sequences of 100 tests
    public static void presort100(TestInteger[] quickSortArray, TestInteger[] timSortArray) {
        for (int x = 0; x < 100; x++) {
            quickSort2ElectricBoogaloo(quickSortArray, x * 100, (x + 1) * 100 - 1);
            quickSort2ElectricBoogaloo(timSortArray, x * 100, (x + 1) * 100 - 1);
        }

        TestInteger temp = new TestInteger();
        temp.getCounter();
    }






    public static TestInteger GenerateTestIntegers(){
        Random rand = new Random();
        TestInteger x = new TestInteger();

        x.value = rand.nextInt(1000000) + 1 ;
        return x;
    }


    public static boolean isSorted(TestInteger[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i].compareTo(array[i+1]) > 0) {
                return false;
            }
        }
        return true;
    }

    private static void quickSort2ElectricBoogaloo(TestInteger[] A, int p, int r){
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
