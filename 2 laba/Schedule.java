import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введiть номер пари в четвер (вiд 1 до 5):");
        int pairNumber = scanner.nextInt();
        
        String subject;
        
        switch (pairNumber) 
        {
            case 1:
                subject = "немає пари";
                break;
            case 2:
                subject = "немає пари";
                break;
            case 3:
                subject = "Лабораторна з ПАЗвТКiРТ";
                break;
            case 4:
                subject = "ЛАбораторна з ООП";
                break;
            case 5:
                subject = "Лабораторна з ООП";
                break;
            default:
                System.out.println("Невiрний номер пари!");
                scanner.close();
                return;
        }
        if (subject.equals("немає пари"))
        {
            System.out.println("На " + pairNumber + " парi у вас " + subject);
        }
        else
        {
        System.out.println("На " + pairNumber + " парi у вас " + subject);
        }
        scanner.close();
    }
}