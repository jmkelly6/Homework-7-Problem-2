import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;


public class MaxHeapTest {
    // homework
    public void testAdd() {
        MaxHeap heap = new MaxHeap(3);
        int[] toAdd = {0,1,2,3,4};

        boolean[] answers = new boolean[5];
        answers[0] = true;
        answers[1] = true;
        answers[2] = true;

        boolean[] tests = new boolean[5];

        for(int i = 0; i < toAdd.length; i++){
            //tests[i] = heap.add(toAdd[i]);
            System.out.println("I is: " + i);
            assertTrue(String.valueOf(answers[i]), heap.add(toAdd[i]));
        }
    }

    public void testGet(){
        MaxHeap heap = new MaxHeap(5);
        Integer[] forHeap = {1,2,3,4,5};
        heap.MaxHeapLogN(forHeap);

        Integer[] answers = {2,3,0,1,4};
        for(int i = 0; i < answers.length; i++) {

        }
    }

    // To test run time for MaxHeapLogN
    private long testMaxHeapLogNTime(Integer[] ints, int size) {

        MaxHeap heap = new MaxHeap(size);

        long startTime = System.nanoTime();

        heap.MaxHeapLogN(ints);

        long endTime = System.nanoTime();

        return TimeUnit.MICROSECONDS.convert(endTime-startTime, TimeUnit.NANOSECONDS);
    }

    // To test run time for MaxHeapN
    private long testMaxHeapNTime(Integer[] ints, int size) {

        MaxHeap heap = new MaxHeap(size);

        long startTime = System.nanoTime();

        heap.MaxHeapN(ints);

        long endTime = System.nanoTime();

        return TimeUnit.MICROSECONDS.convert(endTime-startTime, TimeUnit.NANOSECONDS);
    }
}