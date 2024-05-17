// Custom exception class
class CustomException extends Exception {
    // Constructor to initialize the exception message
    public CustomException(String message) {
        super(message);
    }
}

// Class containing a method that may throw the custom exception
class Data_Ranger {
    // Method that throws the custom exception
    public static void validateAge(int age) throws CustomException {
        // Check if age is less than 18
        if (age < 18) {
            // If age is less than 18, throw the custom exception with an appropriate message
            throw new CustomException("Age must be 18 or above");
        } else {
            System.out.println("Age is valid");
        }
    }

    // Main method
    public static void main(String[] args) {
        try {
            // Call the method that may throw the custom exception
            validateAge(15);
        } catch (CustomException e) {
            // Catch the custom exception and handle it
            System.out.println("CustomException caught: " + e.getMessage());
        }
    }
}