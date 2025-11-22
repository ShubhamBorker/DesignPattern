package Structural.FlyWeight;

public class ColoredCircle implements Circle {
    private String color;

    public ColoredCircle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + color + " circle at (" + x + ", " + y + ")");
    }
}
