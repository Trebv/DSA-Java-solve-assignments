import java.util.Scanner;
public class Problem1_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("num1: ");
        int num1 = scan.nextInt();

        System.out.print("num2: ");
        int num2 = scan.nextInt();
        

        if (num1 < num2){
            System.out.println(num2 + " is greater than " + num1);
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
        scan.close();
    }
}
