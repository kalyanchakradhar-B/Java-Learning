package exampleonabstraction;

abstract class Vehicle {

    String brand;
    Vehicle(String brand){
        this.brand = brand;
    }

    abstract void startEngine();

    void turnOnLights() {
        System.out.println(brand + " lights are now on.");
    }
}


