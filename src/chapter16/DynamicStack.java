package chapter16;

import java.util.ArrayList;

public class DynamicStack {

    private class Node {
        Object element;
        Node next;

        Node(Object element) {
            this.element = element;
            this.next = null;
        }

        Node(Object element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    private Node stack;
    private int count;

    public DynamicStack() {
        stack = null;
        count = 0;
    }

    public void push(Object element) {
        stack = new Node(element, stack);
        count++;
    }

    public Object pop() {
        if (stack==null) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        Object el = stack.element;
        stack = stack.next;
        count--;
        return el;
    }

    public Object peek() {
        if (stack == null) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }

        return stack.element;
    }

    public boolean isEmpty() {
        return stack==null;
    }

    public int size() {
        return count;
    }

    public ArrayList<Integer> toArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (Node node = stack; node != null; node=node.next) {
            arr.add((int) node.element);
        }
        return arr;
    }

    public void clear() {
        stack=null;
        count=0;
    }
}
