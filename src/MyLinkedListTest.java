/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/18/2020
 * Time: 8:10 AM
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myList = new MyLinkedList<>();

        // Them phan tu vao list
        myList.add("Code");
        myList.add("Gym");
        myList.add("MonCity");
        System.out.println("Linked List size=" + myList.size());

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element at index " + i + ": " + myList.get(i));
        }

        // Them phan tu tai vi tri chi dinh
        System.out.println("-----------");
        int addIndex = 1;
        String addElement = "C0820K1";
        myList.add(addIndex, addElement);
        System.out.println("Add element at index " + addIndex +": " + addElement);
        System.out.println("Linked List size=" + myList.size());
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element at index " + i + ": " + myList.get(i));
        }

        // Xoa phan tu tai vi tri chi dinh
        System.out.println("-----------");
        int removeIndex = 2;
        String removeElement = myList.remove(removeIndex);
        System.out.println("Remove element at index " + removeIndex +": " + removeElement);
        System.out.println("Linked List size=" + myList.size());
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element at index " + i + ": " + myList.get(i));
        }

    }
}
