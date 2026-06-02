package exampleonabstraction;

public class Motorcycle extends Vehicle{

    Motorcycle(String brand){
        super(brand);
    }
    @Override
    void startEngine() {
        System.out.println(brand + " is starting: Kick-starting or using the handlebar switch.");
    }
}
