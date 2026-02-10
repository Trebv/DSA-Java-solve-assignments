import java.util.Scanner;

public class Problem1_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        System.out.println(greeting(name));
        scan.close();
    }   


    static String greeting(String to){
        return "Hello " + to;
    }
}
