import java.util.Scanner;

public class SquareSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введіть коефіцієнти a, b i c");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        
        double discriminant = b * b - (4 * a * c);
        
        if (discriminant > 0) 
        {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Два коренi рiвняння: " + root1 + " i " + root2);
        } 
        else if (discriminant == 0) 
        {
            double root = -b / (2 * a);
            System.out.println("Один корінь рiвняння: " + root);
        } 
        else 
        {
            System.out.println("Рівняння не має дiйсних коренів");
        }
        
        scanner.close();
    }
}