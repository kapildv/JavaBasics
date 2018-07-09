package designpatterns.builder;

public class Computer {

    //Mandatory Params
    private String HDD;
    private String RAM;
    // Optional Params
    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public static class ComputerBuilder {

        private String HDD;
        private String RAM;

        //Optional Parameter;
        private boolean isGraphicCardEnabled = true;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        public ComputerBuilder setGraphicCardEnabled(boolean graphicCardEnabled) {
            isGraphicCardEnabled = graphicCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);

        }
    }
}
