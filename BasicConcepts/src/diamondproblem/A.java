package diamondproblem;

public interface A extends B{
    default void hello() {
        System.out.print("Hello inside A");
    }

    ;
}
