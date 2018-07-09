package designpatterns.prototype;

public abstract class Shape {

    public int x;
    public int y;
    public String color;

    public Shape() {

    }

    public Shape(Shape targetType) {
        if (targetType != null) {
            this.x = targetType.x;
            this.y = targetType.y;
            this.color = targetType.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape))
            return false;
        Shape shape2 = (Shape) obj;
        return shape2.x == x && shape2.y == y && shape2.color == color;
    }
}
