package designpatterns.factory;

public class FactoryMain {
    public static void main(String args[]) {
        Computer pc = ComputerFactory.getInstance("pc", "2 GB", "500 GB");
        Computer server = ComputerFactory.getInstance("server", "16 GB", "1 TB");
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
