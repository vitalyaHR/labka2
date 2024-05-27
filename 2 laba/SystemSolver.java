import java.util.Scanner;

public class SystemSolver {
    public static void main(String[] args) {
        System.out.println("Введiть x: ");
        Scanner numberInput = new Scanner(System.in);
        String randomX = numberInput.nextLine();
        double x = Double.parseDouble(randomX);

        double sin2cos2x = Math.pow(Math.sin(x), 2) - Math.pow(Math.cos(x), 2);
        double ln = Math.log(3 * x + 2);
        double x2x3 = Math.pow(x, 2) - Math.pow(x, 3);

        if (x < 0) {
            System.out.println("Результат: " + sin2cos2x);
        }

        if (x >= 0 && x <= 2) {
            System.out.println("Результат: " + ln);
        }

        if (x > 2) {
            System.out.println("Результат: " + x2x3);
        }
    }
}