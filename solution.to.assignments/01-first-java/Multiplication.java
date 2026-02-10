import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = scan.nextInt();

        System.out.print("Enter n: ");
        int n = scan.nextInt();

        printMultiplication(num, n);
        scan.close();
    }

    static void printMultiplication(int num, int n){
        for (int i = 1; i <= n; i++){
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
