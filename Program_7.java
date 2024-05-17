class Parent {
    void displayParent() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("This is the child class.");
    }
}

// Main class
class Data_Ranger {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.displayParent();
        obj.displayChild();
    }
}