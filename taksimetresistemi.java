package Giris;
import java.util.Scanner;

/*

Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.

 */

public class taksimetresistemi {
    public static void main(String[] args) {
        double kmUcret = 2.20, kilometre, tutar;
        int acilisUcret = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Kilometre bilgisini giriniz: ");
        kilometre = input.nextDouble();

        tutar = (kilometre * kmUcret) + acilisUcret;
        boolean tutarGecerli = tutar >= 20;
        Double tutarSonuc = tutarGecerli ? tutar : 20.0;
        System.out.println("Taksimetre Ücreti: "+tutarSonuc);

    }
}
