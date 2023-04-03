package p1;
public class MyListTest {
    public static void main(String[] args) {

        MyList<Integer> intArr = new MyList<>();
        intArr.add(1);
        intArr.add(2);
        intArr.add(3);
        intArr.add(4);
        intArr.add(5);
        System.out.println(intArr.get(3));
//        System.out.println(intArr.get(6));
        System.out.println(intArr);
//        System.out.println(intArr.get(-1));
    }

}