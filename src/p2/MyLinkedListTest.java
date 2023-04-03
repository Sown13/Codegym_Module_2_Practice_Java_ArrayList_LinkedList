package p2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
        MyLinkedList list1 = new MyLinkedList(a);
        MyLinkedList list2 = new MyLinkedList(b);
        MyLinkedList list3 = new MyLinkedList(b);
        System.out.println(list2.getNumNodes());
        System.out.println(list3.getNumNodes());
        list1.addFirst(a);
        list1.addFirst(a);
        list1.addFirst(a);
        System.out.println(list1.getNumNodes());
        list1.add(2,b);
        System.out.println(list1.getNumNodes());
        list1.add(8,b);
        System.out.println(list1.getNumNodes());
        System.out.println(list1);
    }
}
