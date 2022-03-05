package Giris;
import java.util.Scanner;

/*
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)
 */

public class vucutkitleendeks {
    public static void main(String[] args) {

        double boy, kilo, endeks;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        Scanner giris = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = giris.nextDouble();

        endeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : "+endeks);

    }
}
