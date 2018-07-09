package designpatterns.adapter;

public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getResult() {
        double result;
        return result = Math.pow(this.width, 2);
    }
}
