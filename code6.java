class code6 {

    // Method with two integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        code6 obj = new code6();

        System.out.println("Sum of 2 integers: " + obj.add(10, 20));
        System.out.println("Sum of 3 integers: " + obj.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + obj.add(10.5, 20.5));
    }
}
