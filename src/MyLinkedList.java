/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/17/2020
 * Time: 2:31 PM
 */
public class MyLinkedList<E> {

    private Node head;
    private int numNodes;

    public MyLinkedList() {

    }

    public void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    public boolean add(E element) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return numNodes;
    }

    public E get(int index) {
        throw new UnsupportedOperationException();
    }

    public class Node {
        Node next;
        Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
}
