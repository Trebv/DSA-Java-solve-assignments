import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        // Fecha en formato yyyy-mm-dd
        String date = "2019-01-09";

        // Extraer el día correctamente
        int day = Integer.parseInt(date.substring(8));
        System.out.println("Día: " + day);

        // Leer año desde teclado
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int year = scan.nextInt();

        // Verificar si es bisiesto
        if (isLeap(year)) {
            System.out.println(year + " es un año bisiesto");
        } else {
            System.out.println(year + " no es un año bisiesto");
        }

        scan.close();
    }

    static boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
