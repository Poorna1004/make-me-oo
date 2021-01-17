package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PointTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);

        double distance = origin.distance(origin);

        Assertions.assertEquals(0, distance);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);

        double distanceBetweenOriginAndPoint1 = origin.distance(point1);
        double distanceBetweenOriginAndPoint2 = origin.distance(point2);

        Assertions.assertEquals(1, distanceBetweenOriginAndPoint1);
        Assertions.assertEquals(1, distanceBetweenOriginAndPoint2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        double distanceBetweenPoint1AndPoint2 = point1.distance(point2);

        Assertions.assertEquals(2, distanceBetweenPoint1AndPoint2);
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        double directionFromOriginAndPoint1 = origin.direction(point1);
        double directionFromOriginAndPoint2 = origin.direction(point2);

        Assertions.assertEquals(0, directionFromOriginAndPoint1);
        Assertions.assertEquals(0, directionFromOriginAndPoint2);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);

        double directionFromOriginAndPoint1 = origin.direction(point1);
        double directionFromOriginAndPoint2 = origin.direction(point2);

        Assertions.assertEquals(Math.PI, directionFromOriginAndPoint1);
        Assertions.assertEquals(Math.PI, directionFromOriginAndPoint2);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);

        double directionFromOriginAndPoint1 = origin.direction(point1);
        double directionFromOriginAndPoint2 = origin.direction(point2);

        Assertions.assertEquals(Math.PI / 2, directionFromOriginAndPoint1);
        Assertions.assertEquals(Math.PI / 2, directionFromOriginAndPoint2);
    }
}
