package chapter16;

import java.util.ArrayList;

public class DynamicDeque {

    private class Node {
        Object element;
        Node prev;
        Node next;

        Node(Object element) {
            this.element = element;
            prev = null;
            next = null;
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

    public DynamicDeque() {
        head = null;
        tail = null;
        count = 0;
    }

    public boolean isEmpty() {
        return count==0;
    }

    public int size() {
        return count;
    }

    public Object peekHead() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Deque is empty");
        }

        return head.element;
    }

    public Object peekTail() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Deque is empty");
        }

        return tail.element;
    }

    public void pushHead(Object element) {
        if (isEmpty()) {
            head = new Node(element);
            tail = head;
        } else {
            Node newNode = new Node(element, null, head);
            head.prev = newNode;
            head = newNode;
        }
        count++;
    }

    public void pushTail(Object element) {
        if (isEmpty()) {
            head = new Node(element);
            tail = head;
        } else {
            Node newNode = new Node(element, tail, null);
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    public Object popHead() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Deque is empty");
        }
        Object el = head.element;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        count--;
        return el;
    }

    public Object popTail() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Deque is empty");
        }
        Object el = tail.element;
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        count--;
        return el;
    }

    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }

    public ArrayList<Integer> toArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (Node node=head; node!=null; node=node.next) {
            arr.add((int) node.element);
        }
        return arr;
    }
}
