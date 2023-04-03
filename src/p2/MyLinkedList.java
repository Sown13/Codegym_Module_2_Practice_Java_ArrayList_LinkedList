package p2;

public class MyLinkedList {

    private Node head;
    private int numNodes;
    public MyLinkedList() {
    }
    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }
    private class Node {
        Node next;
        Object data;
        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}' + "\n";
        }
    }



    public void add(int index, Object data){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }
    public void printList(){
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public void setNumNodes(int numNodes) {
        this.numNodes = numNodes;
    }

    @Override
    public String toString() {
        return "head=" + head +
                ", numNodes=" + numNodes +
                '}'+ "\n";
    }
}
