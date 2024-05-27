import java.util.Scanner;

public class Quadrant {
        public static void main(String[] args) 
        {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введiть координату x:");
        double x = scanner.nextDouble();
        System.out.println("Введiть координату y:");
        double y = scanner.nextDouble();
        
        int quadrant;
        
        if (x > 0 && y > 0) 
        {
            quadrant = 1;
        } 
        else if (x < 0 && y > 0) 
        {
            quadrant = 2;
        } 
        else if (x < 0 && y < 0) 
        {
            quadrant = 3;
        } 
        else if (x > 0 && y < 0) 
        {
            quadrant = 4;
        } 
        else 
        {
            quadrant = 0; 
        }
        
        if (quadrant != 0) 
        {
            System.out.println("Точка знаходиться в " + quadrant + " квадрантi.");
        } 
        else 
        {
            System.out.println("Точка знаходиться на координатнiй вiсi або у початковiй точцi.");
        }
        
        scanner.close();
    }
}