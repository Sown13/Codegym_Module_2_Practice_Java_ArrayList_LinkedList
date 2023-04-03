package p1;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size, E[] elements) {
        this.size = size;
        this.elements = elements;
    }
    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    public void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);

    }
    public E get(int index){
        if (index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + "," + " Size: " + index);
        }
        return (E) elements[index];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDEFAULT_CAPACITY() {
        return DEFAULT_CAPACITY;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(E[] elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
