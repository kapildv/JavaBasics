package designpatterns.prototype;

public class Circle extends Shape {
    public int radius;

    public Circle() {
    }

    @Override
    public Shape clone() {
        return null;
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }

    }
}
