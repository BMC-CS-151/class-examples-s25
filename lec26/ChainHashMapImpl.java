import java.util.AbstractMap.SimpleEntry;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;

public class ChainHashMapImpl<K,V>  extends AbstractHashMap<K,V> {
    private LinkedList<SimpleEntry<K, V>>[] arr; 
    private int N = 10000; //capacity

    public ChainHashMap() {
        createTable();
    }

    protected void createTable() {
        arr = new LinkedList[N];
    }

    // TODO: Add a method int numElements() to count the number of elements in the hash table.  
    // It should be a method within the ChainHashMap class.
    public int numElements() {
        int numElems = 0;
        for (int i=0; i<N; i++) {
            if (arr[i] != null) {
                for (SimpleEntry<K,V> entry : arr[i]) {
                    numElems += 1;
                }
            }
        }

        return numElems;
    }


    /**
     * Returns value associated with key k in bucket with hash value h.
     * If no such entry exists, returns null.
     * @param h  the hash value of the relevant bucket
     * @param k  the key of interest
     * @return   associate value (or null, if no such entry)
     */
    protected V bucketGet(int h, K k) {
        LinkedList bucket = arr[h];
        if (bucket == null) return null;

        Iterator itr = bucket.iterator();

        while (itr.hasNext()) {
            SimpleEntry elem = (SimpleEntry) itr.next();
            if (elem.getKey().equals(k)) {
                return (V) elem.getValue();
            }
        }
        return null;
    }


    /**
     * Associates key k with value v in bucket with hash value h, returning
     * the previously associated value, if any.
     * @param h  the hash value of the relevant bucket
     * @param k  the key of interest
     * @param v  the value to be associated
     * @return   previous value associated with k (or null, if no such entry)
     */
    protected V bucketPut(int h, K k, V v) {
        LinkedList bucket = arr[h];

        if (bucket == null) {
            arr[h] = new LinkedList();
            arr[h].add(new SimpleEntry(k,v));
            size += 1;
            return null;
        }

        Iterator itr = bucket.iterator();
        
        while (itr.hasNext()) {
            SimpleEntry elem = (SimpleEntry) itr.next();
            if (elem.getKey().equals(k)) {
                V oldValue = (V) elem.getValue();
                elem.setValue(v); 
                return oldValue;
            }
        }

        bucket.add(new SimpleEntry(k,v));
        size += 1;

        return v;
    }


    /**
     * Removes entry having key k from bucket with hash value h, returning
     * the previously associated value, if found.
     * @param h  the hash value of the relevant bucket
     * @param k  the key of interest
     * @return   previous value associated with k (or null, if no such entry)
     */
    protected V bucketRemove(int h, K k) {
        LinkedList bucket = arr[h];

        Iterator itr = bucket.iterator();
        
        while (itr.hasNext()) {
            SimpleEntry elem = (SimpleEntry) itr.next();
            if (elem.getKey().equals(k)) {
               V oldValue = (V) elem.getValue();
               itr.remove();
               size -= 1;
               return oldValue;
            }
        }

        return null;

    }

    

}
