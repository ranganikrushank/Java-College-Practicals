import java.io.FileNotFoundException;

class Data_Ranger {
    public static void main(String[] args) {
        try {
            // Calling a method that throws a checked exception
            readDataFromFile("data.txt");
        } catch (FileNotFoundException e) {
            // Catching the checked exception
            System.out.println("File not found: " + e.getMessage());
        }
    }

    // Method that declares throwing a checked exception
    public static void readDataFromFile(String filename) throws FileNotFoundException {
        // Simulating reading data from a file
        // If the file is not found, FileNotFoundException will be thrown
        throw new FileNotFoundException("File '" + filename + "' not found");
    }
}