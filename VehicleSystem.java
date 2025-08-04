class Vehicle {
    void move() {
        System.out.println("Vehicle is moving.");
    }
}

class Car extends Vehicle {
    void fuelType() {
        System.out.println("Car runs on petrol or diesel.");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();       // Inherited method
        car.fuelType();   // Car-specific method
    }
}

