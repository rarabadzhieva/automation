package chapter16;

import java.util.ArrayList;
import java.util.HashMap;

public class DynamicDoubleList {

    private class Node {
        Object element;
        Node prev;
        Node next;

        Node(Object element) {
            this.element = element;
            this.prev = null;
            this.next = null;
        }

        Node(Object element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int count;

    public DynamicDoubleList() {
        head = null;
        tail = null;
        count = 0;
    }

    public void add(Object element) {
        Node node = new Node(element, tail, null);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        count++;
    }

    public void add(Object element, int index) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }

        if (head == null || index == count) {
            add(element);
        } else if (index==0) {
          head.prev = new Node(element, null, head);
          head = head.prev;
          count++;
        } else {
            Node node = head;
            for (int i=0; i<index-1; i++, node=node.next);
            Node newNode = new Node(element, node, node.next);
            node.next=newNode;
            newNode.next.prev=newNode;
            count++;
        }
    }

    public Object remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }

        Node node;
        if (count == 1) {
            node = head;
            head = null;
            tail = null;
            count = 0;
            return node.element;
        }
        if (index == 0) {
            node = head;
            head = head.next;
            head.prev = null;
            count--;
            return node.element;
        }
        if (index == count - 1) {
            node = tail;
            tail = tail.prev;
            tail.next = null;
            count--;
            return node.element;
        }

        node = head;
        for (int i=0; i<index; i++, node=node.next);
        node.prev.next = node.next;
        node.next.prev = node.prev;
        count--;
        return node.element;
    }

    public int indexOf(Object element) {
        Node node = head;
        for (int i=0; i<count; i++, node=node.next) {
            if (((node.element == null) && (element == null)) ||
                    (node.element != null) && node.element.equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public Object elementAt(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid index " + index);
        }
        Node node = head;
        for (int i = 0; i < index; i++, node = node.next);
        return node.element;
    }

    public ArrayList<Integer> toArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        Node node = head;
        for (int i = 0; i < count; i++, node = node.next) {
            arr.add((int) node.element);
        }
        return arr;
    }

    public int getLen() {
        return count;
    }

    public void sort() {
        for (int i=0; i<count; i++) {
            int j=i+1;
            for (Node node=tail; j<count; node=node.prev, j++) {
                if ((int) node.element < (int) node.prev.element) {
                    Object el = node.element;
                    node.element = node.prev.element;
                    node.prev.element = el;
                }
                HashMap<String, Integer> a = new HashMap<>();
            }
        }
    }
}
