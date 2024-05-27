import java.util.Scanner;

public class DvoPar {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введiть число:");
        int number = scanner.nextInt();
        
        if (number >= 10 && number <= 99) 
        { 
            if (number % 2 == 0) 
            { 
                System.out.println("Введене число є двозначним i парним.");
            } 
            else 
            {
                System.out.println("Введене число є двозначним, але не парним.");
            }
        } 
        else 
        {
            System.out.println("Введене число не є двозначним.");
        }
        
        scanner.close();
    }
}