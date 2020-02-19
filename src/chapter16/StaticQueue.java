package chapter16;

public class StaticQueue {

    private final int INIT_SIZE=4;
    private int[] queue=new int[INIT_SIZE];
    private int count=0;

    private int head=0;
    private int tail=0;

    public boolean isEmpty() {
        return count==0;
    }

    public void clear() {
        head=0;
        tail=0;
        count=0;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }

        return queue[head];
    }

    public int get() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }

        int el=queue[head];
        head=(head+1) % queue.length;
        count--;
        return el;
    }

    public void put(int el) {
        if (count==queue.length) {
            int[] newQueue = new int[count*2];
            for (int i=0; i<queue.length; i++) {
                newQueue[i] = queue[(head+i) % queue.length];
            }
            head=0;
            tail=count;
            queue=newQueue;
        }
        queue[tail]=el;
        tail=(tail+1) % queue.length;
        count++;
    }

    public int[] getQueue() {
        int[] newQueue = new int[count];
        for (int i=0; i<newQueue.length; i++) {
            newQueue[i] = queue[(head+i) % queue.length];
        }
        return newQueue;
    }
}
