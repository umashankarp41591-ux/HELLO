class code5{
    public static void main(String[]args){
int length = 5;
        int width = 10;
        int result = calculateArea(length, width);

        System.out.println("The area of the rectangle is: " + result);
    }

    /**
     * This method takes two parameters and returns an integer.
     * @param l - Length (Parameter 1)
     * @param w - Width (Parameter 2)
     * @return The product of l and w (Return Type: int)
     */
    public static int calculateArea(int l, int w) {
        int area = l * w;
        return area; // Sending the value back to the caller
    }
}