class Car {
    String color;

    // 1. The Constructor
    // It must have the EXACT same name as the Class
    public Car(String initialColor) {
        color = initialColor; // Assigning the value
        System.out.println("A new car has been created!");
    }

    void display() {
        System.out.println("Car color: " + color);
    }
}

public class MIT1 {
    public static void main(String[] args) {
        // 2. Calling the constructor using 'new'
        Car myCar = new Car("Red"); 
        
        myCar.display();
    }
}