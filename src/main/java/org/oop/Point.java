package org.oop;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point from) {
        double xDistance = x_Distance(from);
        double yDistance = y_Distance(from);

        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double direction(Point from) {
        double xDistance = x_Distance(from);
        double yDistance = y_Distance(from);

        return Math.atan2(yDistance, xDistance);
    }

    private double x_Distance(Point from) {
        return from.x - x;
    }

    private double y_Distance(Point from) {
        return from.y - y;
    }
}