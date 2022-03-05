package Giris;
import java.util.Scanner;

/*
(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8; */

public class KDVtutarHesaplama {
    public static void main(String[] args) {

        double kdvFiyat, kdvOran, normalFiyat, toplamFiyat;
        Scanner input = new Scanner(System.in);
        System.out.print("Fiyat değerinizini giriniz: ");
        normalFiyat = input.nextInt();
        System.out.println("Fiyat " +normalFiyat+ " olarak alındı. KDV verisi hesaplanıyor.");

        boolean kdvHesap = normalFiyat <= 1000;
        String kdvHesap2 = kdvHesap ? "KDV %18 olarak uygulandı." : "KDV %8 olarak uygulandı.";
        System.out.println(kdvHesap2);

        if (normalFiyat >= 999) {
            kdvOran = 8;
        } else {
            kdvOran = 18;
        }

        kdvFiyat = (normalFiyat * kdvOran) / 100;
        toplamFiyat = normalFiyat + kdvFiyat;
        System.out.print("\tTOPLAM\nKDV'li fiyat: " +toplamFiyat+ "\nNormal Fiyat: " +normalFiyat+ "\nKDV Tutarı: " +kdvFiyat+
        "\nKDV Oranı: %"+kdvOran);

    }
}
