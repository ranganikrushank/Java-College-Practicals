import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Weight in pounds =  ");
        double a = sc.nextDouble();
        double b = (a * 0.45359237);

        System.out.println("Enter Height in inches = ");
        double c = sc.nextDouble();
        double d = (c * 0.0254);

        double BMI = (b / (d * d));
        System.out.println("BMI = " + BMI);

        sc.close();
    }
}