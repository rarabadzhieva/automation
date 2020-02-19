package chapter18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MyHashMapCA {

    private class Entry {
        Object key;
        Object value;
        Entry next;

        Entry() {
            this.key=null;
            this.value=null;
            this.next=null;
        }

        Entry(Object key, Object value, Entry next) {
            this.key=key;
            this.value=value;
            this.next=next;
        }
    }

    private final int SIZE=32;
    private Entry[] hTable = new Entry[SIZE];

    public Object put(Object key, Object value) {
        int hash = key.hashCode() % hTable.length;
        if (hTable[hash]!=null) {
            for (Entry e=hTable[hash]; e!=null ;e=e.next) {
                if (e.key.equals(key)) {
                    Object oldValue=e.value;
                    e.value=value;
                    return oldValue;
                }
            }
        }
        Entry entry = new Entry(key, value, hTable[hash]);
        hTable[hash] = entry;
        return null;
    }

    public Object get(Object key) {
        int hash = key.hashCode() % hTable.length;
        Object value = null;
        for (Entry e=hTable[hash]; e!=null ;e=e.next) {
            if (e.key.equals(key)) {
                value = e.value;
                break;
            }
        }
        return value;
    }

    public Object remove(Object key) {
        int hash = key.hashCode() % hTable.length;
        Object value = null;
        if (hTable[hash]==null) {
            return null;
        }
        if (hTable[hash].key.equals(key)) {
            value = hTable[hash].value;
            hTable[hash] = hTable[hash].next;
            return value;
        }
        for (Entry e=hTable[hash]; e!=null ;e=e.next) {
            if (e.next.key.equals(key)) {
                value = e.next.value;
                e.next = e.next.next;
                break;
            }
        }
        return value;
    }
}
