package exampleonabstraction;

public class Main {
    public static void main(String[] args) {
        // You cannot instantiate an abstract class directly:
        // Vehicle myVehicle = new Vehicle("Generic"); // This would throw an error.

        // You handle them via their concrete forms
        Vehicle myCar = new Car("Tesla");
        Vehicle myBike = new Motorcycle("Ducati");

        // Call the abstract method (Implementation is hidden)
        myCar.startEngine();  // Output: Tesla is starting: Turning the key / pressing Start button.
        myBike.startEngine(); // Output: Ducati is starting: Kick-starting or using the handlebar switch.

        // Call the regular method (Shared logic)
        myCar.turnOnLights(); // Output: Tesla lights are now on.
        myBike.turnOnLights(); // Output: Ducati lights are now on.
    }
}
