import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    public void testCarIsVehicle() {
        Car car = new Car("Toyota", "Camry", 2010);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Honda", "Civic", 2015);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2020);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarCanDriveAt60() {
        Car car = new Car("Ford", "Mustang", 2018);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleCanDriveAt75() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "R1M", 2021);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarStopsWhenParked() {
        Car car = new Car("Chevrolet", "Impala", 2012);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleStopsWhenParked() {
        Motorcycle motorcycle = new Motorcycle("Ducati", "Panigale V4 R", 2022);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}