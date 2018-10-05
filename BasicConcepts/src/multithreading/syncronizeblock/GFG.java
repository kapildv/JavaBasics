package multithreading.syncronizeblock;

class Line {

    // if multiple threads(trains) trying to access
    // this synchronized method on the same Object
    // but only one thread will be able
    // to execute it at a time.
    public void getLine() {
        synchronized (Integer.class) {
            for (int i = 0; i < 3; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void getName() {
        synchronized (String.class) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Kapil");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


class Train extends Thread {
    // Reference variable of type Line.
    Line line;

    Train(Line line) {
        this.line = line;
    }

    @Override
    public void run() {
        line.getLine();
    }
}

class TrainName extends Thread {
    // Reference variable of type Line.
    Line line;

    TrainName(Line line) {
        this.line = line;
    }

    @Override
    public void run() {
        line.getName();
    }
}

class GFG {
    public static void main(String[] args) {
        Line obj = new Line();
        Line obj1 = new Line();

        // we are creating two threads which share
        // same Object.
        Train train1 = new Train(obj);
        TrainName train2 = new TrainName(obj);

        // both threads start executing .
        train1.start();
        train2.start();
    }
}