import java.util.Scanner;
import java.util.Arrays;

public class Program_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++)
        {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        reverseArray(numbers);

        System.out.println("Integers in decreasing order:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }
        scanner.close();
    }

    public static void reverseArray(int[] array)
    {
        int start = 0;
        int end = array.length - 1;
        while (start < end)
        {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}