package designpatterns.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("500 gb", "2 gb")
                .setBluetoothEnabled(true)
                .setGraphicCardEnabled(false)
                .build();

        Task task = new TaskBuilder(5).build();

        System.out.println(task.getId());

        System.out.println("Is Bluetooth On : " + computer.isBluetoothEnabled());
        System.out.println("Is GraphicCard On : " + computer.isGraphicCardEnabled());
        System.out.println("Ram Size : " + computer.getRAM());
        System.out.println("Hdd Size : " + computer.getHDD());
    }
}
