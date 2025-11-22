package Structural.FlyWeight;

public class CircleFactory {
    private static final java.util.Map<String, Circle> circleMap = new java.util.HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = circleMap.get(color);
        if (circle == null) {
            circle = new ColoredCircle(color);
            circleMap.put(color, circle);
            System.out.println("Creating a new " + color + " circle.");
        }
        return circle;
    }
}
