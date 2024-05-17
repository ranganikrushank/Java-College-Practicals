import java.io.File;

class Data_Ranger {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "test1.txt";

        // Create a File object
        File file = new File(filePath);

        // Check if the file exists
        if (file.exists()) {
            // Print file properties
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is File: " + file.isFile());
            System.out.println("Last Modified: " + file.lastModified());
        } else
        {
            System.out.println("File does not exist.");
        }
    }
}