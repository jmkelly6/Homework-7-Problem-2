public class Main {
    // Constants to set the researching sample size for the MaxHeap functions
//    public static Integer[][] testInts = {
//            {4,2,3,1},
//            {6,4,5,3,1,2},
//            {20,17,19,17,17,5,5},
//            {60,57,52,53,48,49,44,32,32,40,7},
//            {100,80,90,70,77,12,11,10,8,9,1},
//            {843,798,825,713,698,567,544,410,407,322},
//    };
//    public static final int MAX_TEST_SIZE = testInts.length;

    public static void main(String[] args) {
        // left empty
        MaxHeapTest test = new MaxHeapTest();
        test.testRunTimes();
        //test.testAdd();
        test.testGet();


        // tests for research purposes
//        for(int i = 0; i < MAX_TEST_SIZE; i++) {
//            System.out.println("Time required to run MaxHeapLogN: " + test.testMaxHeapLogNTime(testInts[i], testInts[i].length));
//            System.out.println("Time required to run MaxHeapN: " + test.testMaxHeapNTime(testInts[i], testInts[i].length));
//        }
    }
}
