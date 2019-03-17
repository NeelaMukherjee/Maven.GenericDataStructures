package TableNested;

import Table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    //private inner class

    private ArrayList<Entry> entries;

    public TableNested() {
        entries = new ArrayList();
    }

    private class Entry<K, V> {

        private K key;

        public void setValue(V value) {
            this.value = value;
        }

        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public V get(K key) {

        for (Entry entry : entries) {
            if (entry.key.equals(key))
                return (V) entry.value;
        }
        return null;
    }

    public void put(K key, V value) {
        boolean bool = false;
        for (Entry entry : entries) {
            if (entry.key.equals(key)) {
                bool = true;
                entry.setValue(value);
            }
        }
        if (bool == false) {
            entries.add(new Entry<K, V>(key, value));
        }

    }

    public void remove(K key) {

        if (get(key) != null) {
            for (Entry entry : entries) {
                if (entry.key.equals(key)) {
                    entries.remove(entry);
                    break;
                }
            }
        }
    }


}
