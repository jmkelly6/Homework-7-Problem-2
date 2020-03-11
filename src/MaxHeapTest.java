import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;


public class MaxHeapTest {
    // homework
    MaxHeap empty = new MaxHeap(0);
    public static Integer[][] testInts = {
            {4,2,3,1},
            {6,4,5,3,1,2},
            {20,17,19,17,17,5,5},
            {60,57,52,53,48,49,44,32,32,40,7},
            {100,80,90,70,77,12,11,10,8,9,1},
            {843,798,825,713,698,567,544,410,407,322},
    };
    public static final int MAX_TEST_SIZE = testInts.length;
    MaxHeap[] heaps = new MaxHeap[MAX_TEST_SIZE];

    // tests for research purposes
    public void testRunTimes() {
        for(int i = 0; i < MAX_TEST_SIZE; i++) {
            System.out.println("Time required to run MaxHeapLogN: " + testMaxHeapLogNTime(testInts[i], testInts[i].length));
            heaps[i] = new MaxHeap(testInts[i].length);
            heaps[i].MaxHeapLogN(testInts[i]);
            System.out.println("Time required to run MaxHeapN: " + testMaxHeapNTime(testInts[i], testInts[i].length));
        }
    }

    public void testAdd() {
        MaxHeap heap = new MaxHeap(3);
        int[] toAdd = {0,1,2,3,4};

        boolean[] answers = new boolean[5];
        answers[0] = true;
        answers[1] = true;
        answers[2] = true;


        for(int i = 0; i < toAdd.length; i++){
            System.out.println("I is: " + i);
            assertEquals(answers[i], heap.add(toAdd[i]));
        }
    }

    public void testGet(){
        Integer[] answers = {4, 6, 20, 60, 100, 843};
        for(int i = 0; i < answers.length; i++) {
            assertEquals(answers[i], heaps[i].get());
        }
    }

    public void testPop() {
        MaxHeap heap = new MaxHeap(5);
        Integer[] forHeap = {6,4,5,3,1,2};
        heap.MaxHeapLogN(forHeap);

        Integer[] answers = {6,5,4,3,2,1};
        for(int i = 0; i < answers.length; i++) {
            assertEquals(answers[i], heap.pop());
        }
    }

    // To test run time for MaxHeapLogN
    public long testMaxHeapLogNTime(Integer[] ints, int size) {

        MaxHeap heap = new MaxHeap(size);

        long startTime = System.nanoTime();

        heap.MaxHeapLogN(ints);

        long endTime = System.nanoTime();

        return TimeUnit.MICROSECONDS.convert(endTime-startTime, TimeUnit.NANOSECONDS);
    }

    // To test run time for MaxHeapN
    public long testMaxHeapNTime(Integer[] ints, int size) {

        MaxHeap heap = new MaxHeap(size);

        long startTime = System.nanoTime();

        heap.MaxHeapN(ints);

        long endTime = System.nanoTime();

        return TimeUnit.MICROSECONDS.convert(endTime-startTime, TimeUnit.NANOSECONDS);
    }
}