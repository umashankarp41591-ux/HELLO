class code3{
    public static void main(String[]args){
        int myNumber = getLuckyNumber();
        
        System.out.println("Your lucky number today is: " + myNumber);
    }

    // 1. No parameters inside the ()
    // 2. Return type is 'int'
    public static int getLuckyNumber() {
        int lucky = 7; 
        
        // 3. Must use the return keyword
        return lucky; 
    }
}
    