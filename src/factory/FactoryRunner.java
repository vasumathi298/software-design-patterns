package factory;


/**
 * Classes:
 * Vehicle serves as the Product interface, defining the common method printVehicle() that all concrete products must implement.
 * TwoWheeler and FourWheeler are concrete product classes representing different types of vehicles, implementing the printVehicle() method.
 * VehicleFactory acts as the Creator interface (Factory Interface) with a method createVehicle() representing the factory method.
 * TwoWheelerFactory and FourWheelerFactory are concrete creator classes (Concrete Factories) implementing the VehicleFactory interface to create instances of specific types of vehicles.
 */
abstract class Vehicle {
    public abstract void printVehicle();
}

class TwoWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am two wheeler");
    }
}

class FourWheeler extends Vehicle {
    public void printVehicle() {
        System.out.println("I am four wheeler");
    }
}

// Factory Interface
interface VehicleFactory {
    Vehicle createVehicle();
}

// Concrete Factory for TwoWheeler
class TwoWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}

// Concrete Factory for FourWheeler
class FourWheelerFactory implements VehicleFactory {
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}

// Client class
class Client {
    private Vehicle pVehicle;

    public Client(VehicleFactory factory) {
        pVehicle = factory.createVehicle();
    }

    public Vehicle getVehicle() {
        return pVehicle;
    }
}

// Driver program
public class FactoryRunner {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Client twoWheelerClient = new Client(twoWheelerFactory);
        Vehicle twoWheeler = twoWheelerClient.getVehicle();
        twoWheeler.printVehicle();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Client fourWheelerClient = new Client(fourWheelerFactory);
        Vehicle fourWheeler = fourWheelerClient.getVehicle();
        fourWheeler.printVehicle();
    }
}