package Structural.FlyWeight;

public class SimpleFlyweightDemo {
    public static void main(String[] args) {
        CircleFactory circleFactory = new CircleFactory();
        Circle redCircle1 = circleFactory.getCircle("Red");
        redCircle1.draw(10, 20);
        Circle redCircle2 = circleFactory.getCircle("Red");
        redCircle2.draw(30, 40);
        Circle blueCircle = circleFactory.getCircle("Blue");
        blueCircle.draw(50, 60);
    }
}
