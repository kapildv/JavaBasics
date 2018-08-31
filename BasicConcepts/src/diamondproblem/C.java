package diamondproblem;

public interface C extends A,B {
    @Override
    default void hello() {
        System.out.print("Inside C hello");
    }
}
