package designpatterns.factorypattern;

public class Poodle implements Animal {
    @Override
    public void speak() {
        System.out.println("The poodle says \"arf\"");
    }
}
