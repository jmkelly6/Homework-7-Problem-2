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
        for(Integer i = this.size; i > 0; i--) {
            heapIfy(i);
        }
    }

    // add an item to the heap
    public boolean add(Integer item) {
        // homework
        //data[++size] = item;
        if(item != 1 && data[item] < data[parent(item)]) {
            swap(data[item], data[parent(item)]);
            heapIfy(parent(item));
            return true;
        }
        return false;
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
        return data[0];
    }

    // remove the root item
    public Integer pop() {
        // homework
        Integer found = data[0];
        data[0] = data[this.size--];
        heapIfy(0);
        return found;
    }

    private void heapIfy(Integer item){
        if(item >= (size / 2) && item <= size) {
            return;
        }
        if(data[item] < data[leftChild(item)] || data[item] < data[rightChild(item)]) {
            if(data[leftChild(item)] > data[rightChild(item)]) {
                swap(item, leftChild(item));
                heapIfy(leftChild(item));
            } else {
                swap(item, rightChild(item));
                heapIfy(rightChild(item));
            }
        }
    }
}
