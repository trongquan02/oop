package lab10.MyMap;

import java.util.NoSuchElementException;

public class MyHashMap implements MyMap {
    final static int INITIAL_SIZE = 8;
    MyHashMapEntry[] table;
    int size = 0;

    public MyHashMap() {
        table = new MyHashMapEntry[INITIAL_SIZE];
    }

    public int getBucket(Object key) {
        int bucket = (Math.abs(key.hashCode()) % table.length);
        while (table[bucket] != null && table[bucket].getKey() != key) {
            bucket = (bucket + 1) % table.length;
        }
        return bucket;
    }

    public double capacityRatio() {
        return size / (double) table.length;
    }

    public void enlarge() {
        MyHashMapEntry[] tmp = new MyHashMapEntry[table.length * 2];
        System.arraycopy(table, 0, tmp, 0, size);
        table = tmp;
    }

    @Override
    public Object get(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            return table[bucket].getValue();
        }
        return -1;
    }

    @Override
    public void put(Object key, Object value) {
        if (capacityRatio() > 0.6) {
            enlarge();
        }
        int bucket = getBucket(key);
        if (table[bucket] == null) {
            table[bucket] = new MyHashMapEntry(key, value);
            size++;
        }
    }

    @Override
    public void remove(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] == null) {
            throw new NoSuchElementException();
        } else {
            table[bucket] = null;
            size--;
        }
    }

    @Override
    public boolean contains(Object key) {
        int bucket = getBucket(key);
        if (this.table[bucket] != null && this.table[bucket].getKey() == key) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                sb.append(String.format("[bucket %d] -> null\n", i));
            } else {
                sb.append(String.format("[bucket %d] -> (%s, %s)", i, table[i].getKey(), table[i].getValue()));
            }
        }
        return sb.toString();
    }
}
