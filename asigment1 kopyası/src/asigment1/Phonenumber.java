package asigment1;

import java.util.Scanner;

public class Phonenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcıdan 10 haneli telefon numarasını al
        System.out.print("Lütfen 10 haneli telefon numarasını girin: ");
        String phoneNumber = scanner.nextLine();
        
        // Girişin 10 haneli ve yalnızca rakamlardan oluştuğunu kontrol et
        if (phoneNumber.length() == 10 && phoneNumber.matches("[0-9]{10}")) {
            // Tam numara formatı
            String fullNumber = "(" + phoneNumber.substring(0, 3) + ") " +
                                phoneNumber.substring(3, 6) + "-" +
                                phoneNumber.substring(6);
            
            // Yerel numara formatı
            String localNumber = phoneNumber.substring(3, 6) + "-" +
                                 phoneNumber.substring(6);
            
            // Kampüs numarası formatı
            String campusNumber = phoneNumber.substring(5,6) + "-" +
                                  phoneNumber.substring(6);
            
            // Sonuçları yazdır
            System.out.println("Tam: " + fullNumber);
            System.out.println("Yerel: " + localNumber);
            System.out.println("Kampüs: " + campusNumber);
        } else {
            System.out.println("Hata: Lütfen geçerli bir 10 haneli rakamdan oluşan telefon numarası girin.");
        }
        
       
    }
}


           