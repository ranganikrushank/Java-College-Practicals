class Data_Ranger {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result); // This line won't be executed
        } catch (ArithmeticException e) {
            // Catch block for handling ArithmeticException
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            // Finally block always executes regardless of whether an exception is caught or not
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues...");
    }

    // Method that throws ArithmeticException
    public static int divide(int dividend, int divisor) {
        return dividend / divisor; // This may throw ArithmeticException
    }
}