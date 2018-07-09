package designpatterns.factorypattern;

public class Rottweiler implements Animal {
    @Override
    public void speak() {
        System.out.println("The Rottweiler says (in a very deep voice) \"WOOF!\"");
    }
}

