import java.util.Scanner;

public class Problem1_8{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter principal capital: ");
        float principal = scan.nextInt();

        System.out.print("Enter time(years): ");
        float time = scan.nextInt();

        System.out.print("Enter rate(percent): ");
        float rate = scan.nextInt();

        System.out.println(simpleInterest(principal, time, rate));
        scan.close();
    }


    static float simpleInterest(float principal, float time, float rate){
        return principal * time * rate / 100;
    }
}
