class Parent {
    void displayMessage()
    {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    @Override
    void displayMessage()
    {
        System.out.println("This is the child class.");
    }
}

public class Data_Ranger {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        parent.displayMessage();
        child.displayMessage();
    }
}