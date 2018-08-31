package diamondproblem;

public interface B {
    default void hello() {
        System.out.print("Hello inside B");
    }
}
