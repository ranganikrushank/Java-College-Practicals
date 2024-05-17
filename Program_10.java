// Parent class
class Parent {
    // Static method
    static void staticMethod() {
        System.out.println("Static method in Parent class");
    }

    // Dynamic method
    void dynamicMethod() {
        System.out.println("Dynamic method in Parent class");
    }
}

// Child class extending Parent
class Child extends Parent {
    // Static method hiding the parent's static method
    static void staticMethod() {
        System.out.println("Static method in Child class");
    }

    // Dynamic method overriding the parent's dynamic method
    @Override
    void dynamicMethod() {
        System.out.println("Dynamic method in Child class");
    }
}

// Main class
class Data_Ranger {
    public static void main(String[] args) {
        // Static binding - resolved at compile time
        Parent.staticMethod(); // Output: Static method in Parent class
        Child.staticMethod();  // Output: Static method in Child class

        // Dynamic binding - resolved at runtime
        Parent parent = new Child();
        parent.dynamicMethod(); // Output: Dynamic method in Child class
    }
}