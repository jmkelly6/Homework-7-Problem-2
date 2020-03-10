public class MaxHeap implements Heap {
    int capacity;
    int size;

    Integer[] data;

    public MaxHeap(int size) {
        this.size = size;
        data = new Integer[size];
    }

    // Returns position of parent
    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos);
    }
    private int rightChild(int pos) {
        return (2 * pos) + 1;
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

    public void swap(Integer index, Integer parentN) {
        int temp = data[index];
        data[index] = data[parentN];
        data[parentN] = temp;
    }

    // return the max item in the heap
    public Integer get() {
        // homework
        Integer found = data[0];
        data[0] = data[data.length-1];
        heapIfy(0);
        return found;
    }

    // remove the root item
    public Integer pop() {
        // homework
        return null;
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
