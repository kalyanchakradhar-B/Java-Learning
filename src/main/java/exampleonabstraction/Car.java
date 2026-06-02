package exampleonabstraction;

public class Car extends Vehicle{
    Car(String brand){
        super(brand);
    }
    @Override
    void startEngine() {
        System.out.println(brand + " is starting: Turning the key / pressing Start button.");
    }
}
