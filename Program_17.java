import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Data_Ranger {
    public static void main(String[] args) {
        // List operations
        List<String> myList = new ArrayList<>();

        // Adding elements to the list
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        // Displaying the list
        System.out.println("List elements:");
        System.out.println(myList);

        // Stack operations
        Stack<String> myStack = new Stack<>();

        // Pushing elements onto the stack
        myStack.push("Red");
        myStack.push("Green");
        myStack.push("Blue");

        // Displaying the stack
        System.out.println("\nStack elements:");
        System.out.println(myStack);

        // Popping elements from the stack
        String poppedElement = myStack.pop();
        System.out.println("\nPopped element from the stack: " + poppedElement);

        // Displaying the stack after popping
        System.out.println("Stack elements after popping:");
        System.out.println(myStack);
    }
}