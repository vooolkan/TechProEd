package review02;

import java.util.Scanner;

public class SaatDakika {
    public static void main(String[] args) {
        // Scanner kullanarak kullanıcıdan saat, dakika ve saniye bilgilerini alarak sonucu yazdırınz
        // saat,dakika, saniye -->int
        // PM veya AM--> String
        // Örn: 11:25:33 PM

        Scanner sc = new Scanner(System.in);

        System.out.println("Saati giriniz");
        int s = sc.nextInt();

        System.out.println("Dakikayi giriniz");
        int dk = sc.nextInt();

        System.out.println("Saniyeyi giriniz");
        int sn = sc.nextInt();

        System.out.println("PM veya AM giriniz");
        String pmOrAm = sc.next();

        System.out.println("Saat = "+ s + ": " + dk +": "+ sn+ " "+pmOrAm);

      sc.close();
    }
}
