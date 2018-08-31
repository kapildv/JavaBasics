package collections;

public class Driver {

    public static void main(String[] args) {

        BaseClass b = new ChildClass();
        ((ChildClass)b).getB();
    }

}
