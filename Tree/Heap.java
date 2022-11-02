public class Heap{
    protected Integer [] heap;
    protected int size;
    protected int capacity;
    
    public Heap(){
        capacity = 10;
        size = 0;
        heap = new Integer[10];
    }

    public Heap(int cap){
        capacity = cap;
        size = 0;
        heap = new Integer[cap];
    }

    public int[] getChildren(int index){
        int child_one = 2 * (index) +1;
        int child_two = 2 * (index) +2;

        int [] children = {child_one, child_two}; // left, right
        return children;
    }

    public int getParent(int index){
        int parent = (index-1)/2;
        return parent;
    }

    public void add(int num){
        if(size<capacity){
            heap[size] = num;
            size++;
        }
        else{
            resizeHeap(size+1);
        }

    }

    protected Integer[] resizeHeap(int new_size){
        Integer [] new_heap = new Integer[new_size];
        for(int i = 0; i<size && i<new_size; i++){
            new_heap[i] = heap[i];
        }
        heap = new_heap;
        size = new_size;
        capacity = new_size;
        return new_heap;
    }

    public Integer getNext() {
        Integer next = heap[0];
        sortHeap();

        return next;
    }

    public void sortHeap(){

    }

    class MinHeap extends Heap{
        public void sortHeap(){
            int current = getParent(size-1);

            while(current>=0){
                int[] children = getChildren(current);
                if(children[0] > children[1]){
                    swap(current, children[0]);
                }
            }
        }
    }

    class MaxHeap extends Heap{
        public void sortHeap(){
            int current = getParent(size-1);
        }
    }
} 