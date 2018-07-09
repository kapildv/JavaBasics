package designpatterns.factorypattern;

public class SiberianHusky implements Animal<SiberianHusky> {
    @Override
    public void speak() {
        System.out.println("The husky says \"Dude, what's up?\"");
    }
}
