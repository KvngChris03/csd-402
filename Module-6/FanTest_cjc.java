/**
 * Christopher Craig
 * CSD-402
 * July 19, 2026
 *
 * Fan.java demonstration - models a ceiling fan with speed, power,
 * radius, and color, then exercises the class with two test instances.
 */

class Fan {
    // Speed constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /** No-argument constructor - sets all fields to default values. */
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    /** Constructor that sets all fields from the given arguments. */
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (!on) {
            return "Fan is off. Color: " + color + ", Radius: " + radius;
        }
        String speedText;
        switch (speed) {
            case SLOW:
                speedText = "slow";
                break;
            case MEDIUM:
                speedText = "medium";
                break;
            case FAST:
                speedText = "fast";
                break;
            default:
                speedText = "stopped";
        }
        return "Fan is on. Speed: " + speedText + ", Color: " + color
                + ", Radius: " + radius;
    }
}

public class FanTest_cjc {
    public static void main(String[] args) {
        // Fan 1: created with the no-argument constructor
        Fan fan1 = new Fan();
        System.out.println("Fan 1 (default constructor):");
        System.out.println(fan1);

        // Modify fan1 using setters to show functionality
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setColor("black");
        fan1.setRadius(8);
        System.out.println("Fan 1 after changes:");
        System.out.println(fan1);
        System.out.println();

        // Fan 2: created with the argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "silver");
        System.out.println("Fan 2 (argument constructor):");
        System.out.println(fan2);

        // Demonstrate getters
        System.out.println("Fan 2 speed value: " + fan2.getSpeed());
        System.out.println("Fan 2 radius: " + fan2.getRadius());
        System.out.println("Fan 2 color: " + fan2.getColor());
        System.out.println("Fan 2 is on: " + fan2.isOn());

        // Turn fan2 off to show toString() branching
        fan2.setOn(false);
        System.out.println("Fan 2 after being turned off:");
        System.out.println(fan2);
    }
}
