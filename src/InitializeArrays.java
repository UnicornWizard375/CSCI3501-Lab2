import java.util.Arrays;
import java.util.Random;

public class InitializeArrays {
        public static void main(String[] args) {
        int length = 6;
        TestInteger[] timSortArray = new TestInteger[length];
        TestInteger[] quickSortArray = new TestInteger[length];
        TestInteger[] randPArray = new TestInteger[length];
        TestInteger[] medianArray = new TestInteger[length];
        TestInteger[] insertArray = new TestInteger[length];
        TestInteger counter = new TestInteger();

        for(int x = 0; x < length; x++){
            TestInteger temp = GenerateTestIntegers();
            timSortArray[x] = temp;
            quickSortArray[x] = temp;
            randPArray[x] = temp;
            medianArray[x] = temp;
            insertArray[x] = temp;
        }


        //sortedPresort(quickSortArray, timSortArray, length);
        //presort10(quickSortArray, timSortArray);
        //presort100(quickSortArray, timSortArray);


        SortingAnalysis2ElectricBoogaloo.quickSort2ElectricBoogaloo(quickSortArray, 0, length-1);
        System.out.println("Is quickSort sorted? " + isSorted(quickSortArray));
        System.out.println("Number of comparisons for quick sort: " + counter.getCounter());


        Arrays.sort(timSortArray);
        System.out.println("Is timSort sorted? " + isSorted(timSortArray));
        System.out.println("Number of comparisons for tim sort: " + counter.getCounter());

        RandomizedQuicksort.randomQuicksortFunction(randPArray, 0, length-1);
        System.out.println("Is random partition sort sorted? " + isSorted(randPArray));
        System.out.println("Number of comparisons for random partition: " + counter.getCounter());

        MedianQuicksort.medianQuicksortFunction(medianArray, 0, length-1);
        System.out.println("Is median partition sort sorted? " + isSorted(medianArray));
        System.out.println("Number of comparisons for median partition: " + counter.getCounter());

        InsertQuicksort.insertQuicksortFunction(insertArray, 0, length-1);
        System.out.println("Is insert partition sort sorted? " + isSorted(insertArray));
        System.out.println("Number of comparisons for insert partition: " + counter.getCounter());



            //this clears the variable we use to count the comparisons

            counter.getCounter();


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
            Arrays.sort(quickSortArray, x * 1000, (x + 1) * 1000 - 1);
            Arrays.sort(timSortArray, x * 1000, (x + 1) * 1000 - 1);
        }

        TestInteger temp = new TestInteger();
        temp.getCounter();
    }




        //This was added for the 100 sequences of 100 tests
        public static void presort100(TestInteger[] quickSortArray, TestInteger[] timSortArray) {
        for (int x = 0; x < 100; x++) {
            Arrays.sort(quickSortArray, x * 100, (x + 1) * 100 - 1);
            Arrays.sort(timSortArray, x * 100, (x + 1) * 100 - 1);
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
}
