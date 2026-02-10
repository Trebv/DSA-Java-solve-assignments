import java.util.Scanner;

public class Problem1_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter rupees: ");
        int rupeesCurrency = scan.nextInt();

        System.out.println(convertToUSD(rupeesCurrency));

        scan.close();
    }


    static float convertToUSD(int currency){
        return (float) (currency * 0.011);
    }
}
