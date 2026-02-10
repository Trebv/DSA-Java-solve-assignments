import java.util.Scanner;


public class Problem1_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int sum = 0;
        while (true) {
            String user_input = scan.next();
            if (user_input.equals("x")) {
                break;
            }
            int num = Integer.valueOf(user_input);
            sum += num;
        }


        System.out.println("sum = " + sum);
        
    }
}
