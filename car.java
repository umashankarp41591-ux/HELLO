class Car {
    // 1. Private variable (Encapsulation: hidden from the outside)
    private String color;

    // 2. Setter method to change the color safely
    public void setColor(String color) {
        this.color = color;
    }

    // 3. A method to make the car "run"
    public void run() {
        System.out.println("The " + color + " car is now running!");
    }
}

public class MIT {
    // Fixed "vid" to "void" and "STring" to "String"
    public static void main(String[] args) {
        // Create the object
        Car rr = new Car();

        // Use the setter method instead of ">"
        rr.setColor("White & Blue");

        // Call the run method
        rr.run();
    }
}