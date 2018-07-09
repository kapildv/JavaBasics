package designpatterns.factorypattern;

public class AnimalFactory {

    public static Animal getAnimal(String criteria) {
        if (criteria.equals("small"))
            return new Poodle();
        else if (criteria.equals("big"))
            return new Rottweiler();
        else if (criteria.equals("working"))
            return new SiberianHusky();
        else
            return null;
    }
}
