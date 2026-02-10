import java.util.Scanner;

public class Problem1_6 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if (isEven(num)) {
            System.out.println("Is even!");
        } else{
            System.out.println("Is odd!");
        }
        scan.close();
    }


    static boolean isEven(int num){
        return num % 2 == 0;
    }
}
