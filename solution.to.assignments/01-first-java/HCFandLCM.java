import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = scan.nextInt();
    
    
        System.out.print("Enter num2: ");
        int num2 = scan.nextInt();


        System.out.println(hcf(num1, num2));

        scan.close();
    }


    static int hcf(int num1, int num2){ 
        while(num2 > 0){  
            int temp = num1; 
            num1 = num2; 
            num2 = temp % num2; 
        }

        return num1;
    }
}
