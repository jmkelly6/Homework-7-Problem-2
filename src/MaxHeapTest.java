import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.Random;


public class MaxHeapTest {
    // Constants to set the researching sample size for the MaxHeap functions
    public static final int INCREMENT = 10;
    public static final int MAX_TEST_SIZE = 8 * INCREMENT;

    MaxHeap empty = new MaxHeap(0);
    public Integer[][] forHeaps = {
            {4,2,3,1},
            {6,4,5,3,1,2},
            {20,17,19,17,17,5,5},
            {60,57,52,53,48,49,44,32,32,40,7},
            {100,80,90,70,77,12,11,10,8,9,1},
            {843,798,825,713,698,567,544,410,407,322},
    };
    MaxHeap[] heaps = new MaxHeap[forHeaps.length];

    public void initializeHeaps() {
        for (int i = 0; i < forHeaps.length; i++) {
            heaps[i] = new MaxHeap(forHeaps[i].length);
            heaps[i].MaxHeapLogN(forHeaps[i]);
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
            assertEquals(answers[i], heap.add(toAdd[i]));
        }
    }

    @Test
    public void testGet(){
        initializeHeaps();
        Integer[] answers = {4, 6, 20, 60, 100, 843};
        for(int i = 0; i < answers.length; i++) {
            assertEquals(answers[i], heaps[i].get());
        }
    }

    @Test
    public void testPop() {
        MaxHeap heap = new MaxHeap(6);
        Integer[] forHeap = {6,4,5,3,1,2};
        heap.MaxHeapLogN(forHeap);

        Integer[] answers = {6,5,4,3,2,1};
        for(int i = 0; i < answers.length; i++) {
            assertEquals(answers[i], heap.pop());
        }
    }
}