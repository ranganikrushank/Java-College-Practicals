public class Program_5 {
    public void printMessage(String message) {
        System.out.println(message);
    }
    public void printMessage(int number) {
        System.out.println(number);
    }
    public void printMessage(double number) {
        System.out.println(number);
    }

    public Program_5() {
        System.out.println("Default constructor called.");
    }

    public Program_5(int number) {
        System.out.println("Constructor with int parameter called. Number = " + number);
    }

    public Program_5(String message) {
        System.out.println("Constructor with String parameter called. Message = " + message);
    }

    public static void main(String[] args)
    {
        Program_5 program = new Program_5();
        program.printMessage("Hello userone");
        program.printMessage(158);
        program.printMessage(158.55);

        Program_5 program1 = new Program_5();
        Program_5 program2 = new Program_5(158);
        Program_5 program3 = new Program_5("Prajapati Manav");
    }
}