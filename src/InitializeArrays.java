import java.util.Arrays;
import java.util.Random;

public class InitializeArrays {
        public static void main(String[] args) {
            int length = 5000;
            //use a length of multiples of 1000 or else the program won't work
            //for me, length of 10000 gives me a stack overflow, so I changed it to 5000

            TestInteger[] timSortArray = new TestInteger[length];
            TestInteger[] quickSortArray = new TestInteger[length];
            TestInteger[] randPArray = new TestInteger[length];
            TestInteger[] medianArray = new TestInteger[length];
            TestInteger[] insertArray = new TestInteger[length];
            TestInteger counter = new TestInteger();



            //the following loops print out the number of comparisons that were done for each form of sorting on each form of pre-sorted list

            System.out.println("\nStarting printing sorting results on random lists\n");

//prints out the number of comparisons for each sorting type, 5 times, on a list that
            for (int i = 1; i <= 5; i++) {
                RandomList(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                SortingAnalysis2ElectricBoogaloo.quickSort2ElectricBoogaloo(quickSortArray, 0, length - 1);
                System.out.println("Number of comparisons for quick sort on a random list, test number" + i + ": " + counter.getCounter());
            }

            for (int i = 1; i <= 5; i++) {
                RandomList(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                Arrays.sort(timSortArray);
                System.out.println("Number of comparisons for tim sort on a random list, test number" + i + ": " + counter.getCounter());
            }

            for (int i = 1; i <= 5; i++) {
                RandomList(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                RandomizedQuicksort.randomQuicksortFunction(randPArray, 0, length - 1);
                System.out.println("Number of comparisons for random quicksort on a random list, test number" + i + ": " + counter.getCounter());
            }
            for (int i = 1; i <= 5; i++) {
                RandomList(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                MedianQuicksort.medianQuicksortFunction(medianArray, 0, length - 1);
                System.out.println("Number of comparisons for median quicksort on a random list, test number" + i + ": " + counter.getCounter());
            }
            for (int i = 1; i <= 5; i++) {
                RandomList(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                InsertQuicksort.insertQuicksortFunction(insertArray, 0, length - 1);
                System.out.println("Number of comparisons for insert quicksort on a random list, test number" + i + ": " + counter.getCounter());
            }

            System.out.println("\nStarting printing sorting results on list of increasing order\n");

//tests for each form of sorting on a list of increasing order
            for (int i = 1; i <= 5; i++) {
                sortedPresort(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                SortingAnalysis2ElectricBoogaloo.quickSort2ElectricBoogaloo(quickSortArray, 0, length - 1);
                System.out.println("Number of comparisons for quick sort on an increasing order list, test number" + i + ": " + counter.getCounter());
            }

            for (int i = 1; i <= 5; i++) {
                sortedPresort(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                Arrays.sort(timSortArray);
                System.out.println("Number of comparisons for tim sort on an increasing order list, test number" + i + ": " + counter.getCounter());
            }

            for (int i = 1; i <= 5; i++) {
                sortedPresort(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                RandomizedQuicksort.randomQuicksortFunction(randPArray, 0, length - 1);
                System.out.println("Number of comparisons for random quicksort on an increasing order list, test number" + i + ": " + counter.getCounter());
            }
            for (int i = 1; i <= 5; i++) {
                sortedPresort(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                MedianQuicksort.medianQuicksortFunction(medianArray, 0, length - 1);
                System.out.println("Number of comparisons for median quicksort on an increasing order list, test number" + i + ": " + counter.getCounter());
            }
            for (int i = 1; i <= 5; i++) {
                sortedPresort(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                InsertQuicksort.insertQuicksortFunction(insertArray, 0, length - 1);
                System.out.println("Number of comparisons for insert quicksort on an increasing order list, test number" + i + ": " + counter.getCounter());
            }

            System.out.println("\nStarting printing sorting results on 10 sequences of 1000 elements\n");

            //sorting on a list composed of 10 sequences of 1000 element
            for (int i = 1; i <= 5; i++) {
                presort10(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                SortingAnalysis2ElectricBoogaloo.quickSort2ElectricBoogaloo(quickSortArray, 0, length - 1);
                System.out.println("Number of comparisons for quick sort on the 10 sequences of 1000, test number" + i + ": " + counter.getCounter());
            }

            for (int i = 1; i <= 5; i++) {
                presort10(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                Arrays.sort(timSortArray);
                System.out.println("Number of comparisons for tim sort on the 10 sequences of 1000, test number" + i + ": " + counter.getCounter());
            }

            for (int i = 1; i <= 5; i++) {
                presort10(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                RandomizedQuicksort.randomQuicksortFunction(randPArray, 0, length - 1);
                System.out.println("Number of comparisons for random quicksort on the 10 sequences of 1000, test number" + i + ": " + counter.getCounter());
            }
            for (int i = 1; i <= 5; i++) {
                presort10(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                MedianQuicksort.medianQuicksortFunction(medianArray, 0, length - 1);
                System.out.println("Number of comparisons for median quicksort on the 10 sequences of 1000, test number" + i + ": " + counter.getCounter());
            }
            for (int i = 1; i <= 5; i++) {
                presort10(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                InsertQuicksort.insertQuicksortFunction(insertArray, 0, length - 1);
                System.out.println("Number of comparisons for insert quicksort on the 10 sequences of 1000, test number" + i + ": " + counter.getCounter());
            }

            System.out.println("\nStarting printing sorting results on 100 sequences of 100\n");
            //100 sequences of 100 list
            for (int i = 1; i <= 5; i++) {
                presort100(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                SortingAnalysis2ElectricBoogaloo.quickSort2ElectricBoogaloo(quickSortArray, 0, length - 1);
                System.out.println("Number of comparisons for quick sort on the 100 sequences of 100, test number" + i + ": " + counter.getCounter());
            }

            for (int i = 1; i <= 5; i++) {
                presort100(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                Arrays.sort(timSortArray);
                System.out.println("Number of comparisons for tim sort on the 100 sequences of 100, test number" + i + ": " + counter.getCounter());
            }

            for (int i = 1; i <= 5; i++) {
                presort100(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                RandomizedQuicksort.randomQuicksortFunction(randPArray, 0, length - 1);
                System.out.println("Number of comparisons for random quicksort on the 100 sequences of 100, test number" + i + ": " + counter.getCounter());
            }
            for (int i = 1; i <= 5; i++) {
                presort100(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                MedianQuicksort.medianQuicksortFunction(medianArray, 0, length - 1);
                System.out.println("Number of comparisons for median quicksort on the 100 sequences of 100, test number" + i + ": " + counter.getCounter());
            }
            for (int i = 1; i <= 5; i++) {
                presort100(quickSortArray, timSortArray, randPArray, medianArray, insertArray, length);
                InsertQuicksort.insertQuicksortFunction(insertArray, 0, length - 1);
                System.out.println("Number of comparisons for insert quicksort on the 100 sequences of 100, test number" + i + ": " + counter.getCounter());
            }
    }

        //This is for pre-sorted list
        public static void sortedPresort(TestInteger[] quickSortArray, TestInteger[] timSortArray,
                                         TestInteger[] randPArray, TestInteger[] medianArray,
                                         TestInteger[] insertArray,int length) {
        for (int x = 0; x < length; x++) {
            TestInteger temp = new TestInteger();
            temp.value = x;
            timSortArray[x] = temp;
            quickSortArray[x] = temp;
            randPArray[x] = temp;
            medianArray[x] = temp;
            insertArray[x] = temp;
        }
        TestInteger temp2 = new TestInteger();
        temp2.getCounter();
    }


        //This was added for the 10 sequences of 1000 tests
        public static void presort10(TestInteger[] quickSortArray, TestInteger[] timSortArray,
                                     TestInteger[] randPArray, TestInteger[] medianArray,
                                     TestInteger[] insertArray,int length) {
        for (int x = 0; x < (length / 1000); x++) {
            Arrays.sort(quickSortArray, x * (length/10), (x + 1) * (length/10) - 1);
            Arrays.sort(timSortArray, x * (length/10), (x + 1) * (length/10) - 1);
            Arrays.sort(randPArray, x * (length/10), (x + 1) * (length/10) - 1);
            Arrays.sort(medianArray, x * (length/10), (x + 1) * (length/10) - 1);
            Arrays.sort(insertArray, x * (length/10), (x + 1) * (length/10) - 1);
        }

        TestInteger temp = new TestInteger();
        temp.getCounter();
    }




        //This was added for the 100 sequences of 100 tests
        public static void presort100(TestInteger[] quickSortArray, TestInteger[] timSortArray,
                                      TestInteger[] randPArray, TestInteger[] medianArray,
                                      TestInteger[] insertArray,int length) {
        for (int x = 0; x < (length/100); x++) {
            Arrays.sort(quickSortArray, x * (length/100), (x + 1) * (length/100) - 1);
            Arrays.sort(timSortArray, x * (length/100), (x + 1) * (length/100) - 1);
            Arrays.sort(randPArray, x * (length/100), (x + 1) * (length/100) - 1);
            Arrays.sort(medianArray, x * (length/100), (x + 1) * (length/100) - 1);
            Arrays.sort(insertArray, x * (length/100), (x + 1) * (length/100) - 1);
        }

        TestInteger temp = new TestInteger();
        temp.getCounter();
    }

public static void RandomList (TestInteger[] quickSortArray, TestInteger[] timSortArray,
                               TestInteger[] randPArray, TestInteger[] medianArray,
                               TestInteger[] insertArray,int length) {
    for (int x = 0; x < length; x++) {
        TestInteger temp = GenerateTestIntegers();
        quickSortArray[x] = temp;
        timSortArray[x] = temp;
        randPArray[x] = temp;
        medianArray[x] = temp;
        insertArray[x] = temp;
    }
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
