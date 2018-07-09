package designpatterns.factory;

public class ComputerFactory {

    public static Computer getInstance(String type, String ram, String hdd) {
        if ("PC".equalsIgnoreCase(type)) {
            return new PC(type, ram, hdd);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(type, ram, hdd);
        } else
            return null;
    }
}
