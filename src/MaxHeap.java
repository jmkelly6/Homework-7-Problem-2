public class MaxHeap implements Heap {
    int capacity;
    int size;

    Integer[] data;

    public MaxHeap(int size) {
        this.size = size;
        data = new Integer[size];
    }

    // return position of parent
    private Integer parent(Integer pos) {
        return (pos - 1) / 2;
    }

    // return left child
    private Integer leftChild(Integer pos) {
        return (2 * pos) + 1;
    }

    // return right child
    private Integer rightChild(Integer pos) {
        return (2 * pos) + 2;
    }

    // build a heap based on data
    // to be implemented in O(nlogn)
    public void MaxHeapLogN(Integer[] data) {
        // homework
        this.data = new Integer[data.length];
        for(int i = 0; i < data.length; i++){
            this.data[i] = data[i];
        }
    }

    // build a heap based on data
    // to be implemented in O(n)
    public void MaxHeapN(Integer[] data) {
        // homework
        this.size = data.length;
        for(Integer i = this.size; i > 0; i--) {        //THIS ISN'T RIGHT YET, INITIAL CONDITION
            heapIfyUp(i);
        }
    }

    // add an item to the heap
    public boolean add(Integer item) {
        // homework
        if(size == 0) {
            return false;
        }
        data[size] = item;
        heapIfyUp(item);
        return true;
    }

    // helper function to swap items in the heap
    public void swap(Integer index, Integer parentN) {
        int temp = data[index];
        data[index] = data[parentN];
        data[parentN] = temp;
    }

    // return the max item in the heap
    public Integer get() {
        // homework
        if(size == 0) {
            return null;
        }
        return data[0];
    }

    // remove the root item
    public Integer pop() {
        // homework
        if(size == 0) {
            return null;
        }
        Integer found = data[0];
        data[0] = data[this.size--];
        heapIfyDown(data, 0);
        return found;
    }

    private void heapIfyDown(Integer[] heap, int index){
        //if(item >= (size / 2) && item <= size) {
            //return;
        //}
//        if(data[item] < data[leftChild(item)] || data[item] < data[rightChild(item)]) {
//            if(data[leftChild(item)] > data[rightChild(item)]) {
//                swap(item, leftChild(item));
//                heapIfyDown(leftChild(item));
//            } else {
//                swap(item, rightChild(item));
//                heapIfyDown(rightChild(item));
//            }
//        }
        Integer smallest = index;
        Integer l = leftChild(index);
        Integer r = rightChild(index);
        if (l <= index && heap[l] < heap[smallest]) {
            smallest = l;
        }
        if (r <= index && heap[r] < heap[smallest]) {
            smallest = r;
        }
        if(smallest != index) {
            swap(smallest, index);
            heapIfyDown(heap, smallest);
        }
    }

    private void heapIfyUp(Integer item) {
        if(item != 1 && data[item] < data[parent(item)]) {
            swap(data[item], data[parent(item)]);
            heapIfyUp(parent(item));
        }
    }
}
