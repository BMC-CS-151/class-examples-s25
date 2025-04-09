import java.util.AbstractMap.SimpleEntry;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class ChainHashMap<K,V>  extends AbstractHashMap<K,V> {
    //TODO 1 & 2: what should our underlying array look like?
    //        implement creteTable

    private LinkedList<SimpleEntry<K, V>>[] arr; 
    private int size;
    private int N = 10001; //capacity

    public ChainHashMap() {
        size = 0;
        createTable();
    }

    protected void createTable() {
        arr = new LinkedList[N];
    }

    /**
     * Returns value associated with key k in bucket with hash value h.
     * If no such entry exists, returns null.
     * @param h  the hash value of the relevant bucket
     * @param k  the key of interest
     * @return   associate value (or null, if no such entry)
     */
    protected V bucketGet(int h, K k) {
        //TODO 4: implement bucketGet using an iterator 
        LinkedList<SimpleEntry<K,V>> bucket = arr[h];
        if (arr[h] == null) {
            return null;
        }

        Iterator<SimpleEntry<K,V>> itr = bucket.iterator();
        while(itr.hasNext()) {
            SimpleEntry<K,V> elem = itr.next();
            if (elem.getKey().equals(k)) {
                return elem.getValue();
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
        //TODO 5: implement bucketPut (AbstractHashMap implements put)
        LinkedList bucket = arr[h];
        if (bucket == null) {
            arr[h] = new LinkedList();
            arr[h].add(new SimpleEntry(k,v));
            size++;
            return null;
        }
        Iterator itr = bucket.iterator();
        while(itr.hasNext()) {
            SimpleEntry elem = (SimpleEntry) itr.next();
            if (elem.getKey().equals(k)) {
                V oldValue = (V) elem.getValue();
                elem.setValue(v);
                return oldValue;
            }
        }
        size++;
        bucket.add(new SimpleEntry(k, v));
        return null;
    }

    /**
     * Removes entry having key k from bucket with hash value h, returning
     * the previously associated value, if found.
     * @param h  the hash value of the relevant bucket
     * @param k  the key of interest
     * @return   previous value associated with k (or null, if no such entry)
     */
    protected V bucketRemove(int h, K k) {
        //TODO 6: implement bucketRemove (AbstractHashMap implements remove) 
        LinkedList<SimpleEntry<K,V>> bucket = arr[h];
        if (bucket == null) {
            return null;
        }

        Iterator<SimpleEntry<K,V>> itr = bucket.iterator();
        while(itr.hasNext()) {
            SimpleEntry<K,V> elem = itr.next();
            if (elem.getKey().equals(k)) {
                V oldValue = elem.getValue();
                bucket.remove(elem);
                size--;
                return oldValue;
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        //map of everyone's grades
        ChainHashMap<String, Integer> map = new ChainHashMap();
        assert map.isEmpty();
        assert map.get("Elizabeth") == null;

        map.put("Elizabeth", 75);
        assert map.get("Elizabeth") == 75;
        assert map.size() == 1;

        map.put("Cinnabon", 100);
        assert map.get("Cinnabon") == 100;

        map.put("Steve", 90);
        assert map.get("Steve") == 90;

        map.put("Dianna", 95);
        assert map.get("Dianna") == 95;
        assert map.size() == 4;

        map.remove("Steve");
        assert map.get("Steve") == null;
        assert map.size() == 3;

        map.put("Elizabeth", 80);
        assert map.get("Elizabeth") == 80;
        assert map.size() == 3;


    }

    //iterator and iterables
    public Iterable<Entry<K,V>> entrySet() {
        ArrayList<Entry<K,V>> buffer = new ArrayList<>();

        for (int i=0; i<N; i++) {
            if (arr[i] != null) {
                for (SimpleEntry<K,V> entry : arr[i]) {
                    buffer.add((Entry)entry);
                }
            }
        }

        return buffer;
    }


}
