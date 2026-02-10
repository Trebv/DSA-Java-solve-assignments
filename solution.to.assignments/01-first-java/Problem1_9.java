import java.util.Scanner;

public class Problem1_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Enter num1: ");
        int num1 = scan.nextInt();

        System.out.print("Enter num1: ");
        int num2 = scan.nextInt();

        
        System.out.print("Operator: ");
        String operator = scan.next();

        switch (operator) {
            case "+"-> System.out.println("Result: " + (num1 + num2));
            case "-"-> System.out.println("Result: " + (num1 - num2));
            case "*"-> System.out.println("Result: " + (num1 * num2));
            case "/"-> System.out.println("Result: " + (num1 / num2));
        }

        scan.close();
    }
}
