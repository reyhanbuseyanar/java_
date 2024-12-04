package asigment1;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcıdan pozitif bir sayı al
        System.out.print("Pozitif bir sayı girin: ");
        int inputNumber = scanner.nextInt();
        if (inputNumber < 0) {
            System.out.println("Please enter a positive number.");
            return; // İşlemi sonlandır

        }
        
        // Fibonacci sayılarını tutmak için değişkenler
        int a = 0; // F(0)
        int b = 1; // F(1)
        int index = 0; // Başlangıç indeksi

        // 0 için özel durum
        if (inputNumber == 0) {
            System.out.println("En yakın Fibonacci sayısı 0, indeks: 0.");
            return; // İşlemi sonlandır

        }
        
        // 1 için özel durum
        if (inputNumber == 1) {
            System.out.println("En yakın Fibonacci sayısı 1, indeks: 1 ve 2.");
            return; // İşlemi sonlandır

        }

        // En yakın Fibonacci sayısını bul
        while (b < inputNumber) {
            int next = a + b; // Sonraki Fibonacci sayısını hesapla
            a = b; // a'yı bir sonraki Fibonacci sayısına güncelle
            b = next; // b'yi bir sonraki Fibonacci sayısına güncelle
            index++; // İndeksi artır
        }
        
        // Fibonacci dizisindeki indeksi güncellemek
        index++; // b, mevcut Fibonacci sayısı, dolayısıyla indeksi bir artır

        // En yakın Fibonacci sayısını belirle
        if (b < inputNumber) {
            System.out.println("En yakın Fibonacci sayısı " + b + ", indeks: " + index + ".");
        } else {
            if (inputNumber - a < b - inputNumber) {
                System.out.println("En yakın Fibonacci sayısı " + a + ", indeks: " + (index - 1) + ".");
            } else {
                System.out.println("En yakın Fibonacci sayısı " + b + ", indeks: " + index + ".");
            }
        }
        

    }
}
