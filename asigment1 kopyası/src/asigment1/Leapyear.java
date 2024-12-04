package asigment1;
import java.util.Scanner;

public class Leapyear{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir yıl girin: ");
        int year = scanner.nextInt();
        
        if (year < 1582) {
            System.out.println("Hata: Yıl 1582 veya daha sonrasında olmalıdır.");
        } else {
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeap) {
                System.out.println(year + "is  a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
        
        scanner.close();
    }
}
