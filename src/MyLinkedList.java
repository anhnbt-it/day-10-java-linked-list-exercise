/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/17/2020
 * Time: 2:31 PM
 */
public class MyLinkedList<E> {

    private Node<E> head;
    private int numNodes;

    public MyLinkedList() {
    }

    public MyLinkedList(E element) {
        this.head = new Node<>(element);
    }

    public void add(int index, E element) {
        Node<E> leftNode = head;
        for (int i = 0; i < index-1 && leftNode.next != null; i++) {
            leftNode = leftNode.next; // LeftNode
        }
        Node<E> rightNode = leftNode.next; // RightNode
        leftNode.next = new Node<>(element); // NewNode
        leftNode.next.next = rightNode;
        numNodes++;
    }

    public boolean add(E element) {
        Node<E> temp = head;
        head = new Node<>(element);
        head.next = temp;
        numNodes++;
        return true;
    }

    public E remove(int index) {
        Node<E> prev = head;
        for (int i = 0; i < index-1; i++) {
            prev = prev.next;
        }
        Node<E> targetNode = prev.next;
        prev.next = targetNode.next;
        numNodes--;
        return targetNode.getData();
    }

    public int size() {
        return numNodes;
    }

    public E get(int index) {
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.getData();
    }

    private static class Node<E> {
        private Node<E> next;
        private E data;

        public Node(E element) {
            this.data = element;
        }

        public E getData() {
            return data;
        }
    }
}
