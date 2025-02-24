public class QueueArr{
    private int arr[];
    private int lastElemIdx; //marks the index of the last element
    private int firstElemIdx;

    public QueueArr() {
        arr = new int[200];
        lastElemIdx = -1;
        firstElemIdx = 0;
    }

    public boolean isEmpty() {
        return firstElemIdx > lastElemIdx;
    }

    public int first() {
        //CASE 1: empty 
        //CASE 2: non-empty
    }

    public void enqueue(int e) {
        //CASE 1: full
        if (full) throw new Exception("stack is full");
        //CASE 2: non full
        arr[lastElemIdx+1] = e;
        lastElemIdx += 1;
    }

    public int dequeue() {
        //FIFO
        //CASE 1: empty
        if (isEmpty()) {
            return null;
        }
        //CASE 2: non-empty
        int poppedElem = arr[firstElemIdx];
        arr[firstElemIdx] = null;
        firstElemIdx += 1;
        return poppedElem;
    }
}
