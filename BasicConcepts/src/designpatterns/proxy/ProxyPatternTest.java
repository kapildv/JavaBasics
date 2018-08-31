package designpatterns.proxy;

public class ProxyPatternTest {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Pankan", "kapil");

        try {
            executor.runCommand("ls -ltr");
            executor.runCommand("ls -ltr");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception Message::" + e.getMessage());
        }

    }
}
