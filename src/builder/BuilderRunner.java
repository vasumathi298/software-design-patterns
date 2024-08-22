package builder;

// Product

/**
 * Product (Vehicle): A complex object with multiple parts (type, wheels, and engine).
 * Builder Interface (VehicleBuilder): Declares methods to build parts of the Vehicle.
 * ConcreteBuilder (TwoWheelerBuilder, FourWheelerBuilder): Implements the VehicleBuilder interface and defines the steps to build a specific type of vehicle.
 * Director (VehicleDirector): Manages the building process using a builder. It defines the order in which to call the building steps.
 * Client (BuilderFactoryRunner): Uses the VehicleDirector to build and retrieve vehicles
 */
class Vehicle {
    private String type;
    private int wheels;
    private String engine;

    public void setType(String type) {
        this.type = type;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void printVehicle() {
        System.out.println("Vehicle Type: " + type + ", Wheels: " + wheels + ", Engine: " + engine);
    }
}

// Builder Interface
interface VehicleBuilder {
    void buildWheels();
    void buildEngine();
    void buildType();
    Vehicle getVehicle();
}

// ConcreteBuilder for TwoWheeler
class TwoWheelerBuilder implements VehicleBuilder {
    private Vehicle vehicle = new Vehicle();

    public void buildWheels() {
        System.out.println("Building 2 wheels for Two Wheeler...");
        vehicle.setWheels(2);
    }

    public void buildEngine() {
        System.out.println("Installing small engine for Two Wheeler...");
        vehicle.setEngine("Small Engine");
    }

    public void buildType() {
        System.out.println("Setting type to Two Wheeler...");
        vehicle.setType("Two Wheeler");
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}

// ConcreteBuilder for FourWheeler
class FourWheelerBuilder implements VehicleBuilder {
    private Vehicle vehicle = new Vehicle();

    public void buildWheels() {
        System.out.println("Building 4 wheels for Four Wheeler...");
        vehicle.setWheels(4);
    }

    public void buildEngine() {
        System.out.println("Installing large engine for Four Wheeler...");
        vehicle.setEngine("Large Engine");
    }

    public void buildType() {
        System.out.println("Setting type to Four Wheeler...");
        vehicle.setType("Four Wheeler");
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}

// Director
class VehicleDirector {
    private VehicleBuilder builder;

    public VehicleDirector(VehicleBuilder builder) {
        this.builder = builder;
    }

    public void constructVehicle() {
        System.out.println("Starting vehicle construction...");
        builder.buildType();
        builder.buildWheels();
        builder.buildEngine();
        System.out.println("Vehicle construction completed.");
    }

    public Vehicle getVehicle() {
        return builder.getVehicle();
    }
}

// Client class
public class BuilderRunner {
    public static void main(String[] args) {
        VehicleBuilder twoWheelerBuilder = new TwoWheelerBuilder();
        VehicleDirector director = new VehicleDirector(twoWheelerBuilder);
        director.constructVehicle();
        Vehicle twoWheeler = director.getVehicle();
        twoWheeler.printVehicle();

        System.out.println();

        VehicleBuilder fourWheelerBuilder = new FourWheelerBuilder();
        director = new VehicleDirector(fourWheelerBuilder);
        director.constructVehicle();
        Vehicle fourWheeler = director.getVehicle();
        fourWheeler.printVehicle();
    }
}
