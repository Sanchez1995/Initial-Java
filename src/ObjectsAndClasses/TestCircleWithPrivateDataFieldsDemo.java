package ObjectsAndClasses;

public class TestCircleWithPrivateDataFieldsDemo {

    public static void main(String[] args) {
        // Create a Circle with radius 5.0
        CircleWithPrivateDataFieldsDemo myCircle =
                new CircleWithPrivateDataFieldsDemo(5.0);
        System.out.println("The area of the circle of radius "
                + myCircle.getRadius() + " is " + myCircle.getArea());

        // Increase myCircle's radius by 10%
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius "
                + myCircle.getRadius() + " is " + myCircle.getArea());
    }

}

class CircleWithPrivateDataFieldsDemo {
    /** The radius of the circle */
    private double radius = 1;

    /** The number of the objects created */
    private static int numberOfObjects = 0;

    /** Construct a circle with radius 1 */
    public CircleWithPrivateDataFieldsDemo() {
        numberOfObjects++;
    }

    /** Construct a circle with a specified radius */
    public CircleWithPrivateDataFieldsDemo(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    /** Return numberOfObjects */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Return the area of this circle */
    public double getArea() {
        return radius * radius * Math.PI;
    }

}
