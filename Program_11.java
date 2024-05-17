// Class with different visibility modifiers
class VisibilityExample {
    public int publicVariable = 10;
    protected int protectedVariable = 20;
    int defaultVariable = 30; // default visibility
    private int privateVariable = 40;

    // Method with public visibility
    public void publicMethod() {
        System.out.println("Public method");
    }

    // Method with protected visibility
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // Method with default visibility
    void defaultMethod() {
        System.out.println("Default method");
    }

    // Method with private visibility
    private void privateMethod() {
        System.out.println("Private method");
    }

    // Main method
    public static void main(String[] args) {
        VisibilityExample example = new VisibilityExample();

        // Accessing variables and methods within the same class
        System.out.println("Public variable: " + example.publicVariable);
        System.out.println("Protected variable: " + example.protectedVariable);
        System.out.println("Default variable: " + example.defaultVariable);
        System.out.println("Private variable: " + example.privateVariable);

        example.publicMethod();
        example.protectedMethod();
        example.defaultMethod();
        example.privateMethod();
    }
}

// Another class in the same package
class Data_Ranger {
    public static void main(String[] args) {
        VisibilityExample example = new VisibilityExample();

        // Accessing variables and methods from another class in the same package
        System.out.println("Public variable: " + example.publicVariable);
        System.out.println("Protected variable: " + example.protectedVariable);
        System.out.println("Default variable: " + example.defaultVariable);
        // Private variables and methods are not accessible from another class
        // System.out.println("Private variable: " + example.privateVariable);
        // example.privateMethod();

        example.publicMethod();
        example.protectedMethod();
        example.defaultMethod();
        // Private methods are not accessible from another class
        // example.privateMethod();
    }
}