//** We dont need this file, it's just for reference

//This was our original test before we realised we were supposed to look at the book, it still worked but there was an error where one number wouldn't be sorted


// import java.util.ArrayList;
//import java.util.Random;
//
//class SortingAnalysis {
//    public static void main(String[] args) {
//
//        ArrayList<Integer> timSortArray = new ArrayList<>();
//        ArrayList<Integer> quickSortArray = new ArrayList<>();
//        int length = 20;
//
//        for(int x = 0; x < length; x++){
//            int temp = GenerateTestIntegers();
//            timSortArray.add(temp);
//            quickSortArray.add(temp);
//        }
//
//        quickSort(quickSortArray,0, length);
//
//        System.out.println(quickSortArray);
//
//    }
//
//    public static int GenerateTestIntegers(){
//        Random rand = new Random();
//
//        int x = rand.nextInt(1000000) + 1 ;
//        return x;
//    }
//
//    private static void quickSort(ArrayList<Integer> inputArrayList, int start, int end){
//        int pivot = inputArrayList.get(start);
//        int pivotLocation = start;
//        int temp = 0;
//
//
//        for(int x = start; x < end; x++){
//            if(inputArrayList.get(x) <= pivot) {
//                temp = inputArrayList.get(pivotLocation);
//                inputArrayList.set(pivotLocation, inputArrayList.get(x));
//                inputArrayList.set(x, temp);
//                pivotLocation = x;
//            } else {
//                boolean exitCondition = true;
//                int y = x;
//                while(y < end && exitCondition) {
//                    if(inputArrayList.get(y) <= pivot) {
//                        temp = inputArrayList.get(x);
//                        inputArrayList.set(x, inputArrayList.get(y));
//                        inputArrayList.set(y, temp);
//                        temp = inputArrayList.get(pivotLocation);
//                        inputArrayList.set(pivotLocation, inputArrayList.get(x));
//                        inputArrayList.set(x, temp);
//                        pivotLocation = x;
//                        exitCondition = false;
//                    } else
//                        y++;
//                }
//
//            }
//
//        }
//
//        if(pivotLocation > 1) {
//            quickSort(inputArrayList, 0, pivotLocation - 1);
//        }
//
//        if(end - pivotLocation > 1) {
//            quickSort(inputArrayList, pivotLocation + 1, end);
//        }
//
//    }
//
//}