import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            int digit = number % 10;
            stack.push(digit);
            number = number / 10;
        }

        int reversedNumber = 0;
        int multiplier = 1;
        while (!stack.isEmpty()) {
            reversedNumber = reversedNumber + stack.pop() * multiplier;
            multiplier = multiplier * 10;
        }

        System.out.println("Число с цифрами в обратном порядке: " + reversedNumber);
    }
}
