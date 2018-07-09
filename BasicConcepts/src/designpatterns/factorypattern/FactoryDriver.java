package designpatterns.factorypattern;

public class FactoryDriver {

    public static void main(String[] args) {
        Animal poodle = AnimalFactory.getAnimal("small");
        poodle.speak();
        ;
        Animal siberianHusky = AnimalFactory.getAnimal("working");
        siberianHusky.speak();
    }
}
