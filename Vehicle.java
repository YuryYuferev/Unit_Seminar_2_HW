public abstract class Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    public abstract void testDrive();

    public abstract void park();

    public int getSpeed() {

        return 0;
    }
    public int getNumWheels() {
        return 0;
    }
}

