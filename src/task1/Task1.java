package task1;

public class Task1 {
    public static void main(final String[] args) {
        final DequeueLinkedList myDequeue = new DequeueLinkedList();
        myDequeue.equeueFirst(1);
        myDequeue.equeueFirst(3);
        myDequeue.equeueFirst(5);
        myDequeue.equeueFirst(-3);
        myDequeue.equeueLast(-1);
        for (final int value : myDequeue) {
            System.out.println(value);
        }
    }
}