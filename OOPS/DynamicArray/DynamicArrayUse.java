package JAVA.OOPS.DynamicArray;

public class DynamicArrayUse {

    public static void main(String[] args) {
        DynamicArray a = new DynamicArray();
        a.add(10);
        a.add(10);
        a.add(10);
        a.add(10);
        a.add(10);
        a.add(10);
        a.add(10);

       a.set(5,56);
        //System.out.println(a.get(5));




        while (!a.isEmpty()){
            System.out.println(a.removeLast());
            System.out.println(a.size());
        }

    }
}
