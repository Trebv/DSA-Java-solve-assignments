import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter num1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scan.nextInt();

        System.out.println( "Sum: " + sum(num1, num2));
        scan.close();
    }

    static int sum(int num1, int num2){
        return num1 + num2;
    }
}
