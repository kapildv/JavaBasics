public class Tripleton {

    public static Tripleton instance1 = null;
    public static Tripleton instance2 = null;
    public static Tripleton instance3 = null;
    static int count = 0;

    private Tripleton() {

    }

    public static Tripleton getInstance() {
        if (count == 0 && instance1 == null) {
            instance1 = new Tripleton();
            return instance1;
        } else if (count == 1 && instance2 == null) {
            instance2 = new Tripleton();
            return instance2;
        } else if (count == 2 && instance3 == null) {
            instance3 = new Tripleton();
            return instance3;
        }
        return instance1;
    }
}

