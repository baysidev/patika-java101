package Giris;
import java.io.FilterOutputStream;
import java.util.Scanner;

public class ucakbilethesap {
    public static void main(String[] args) {

        double mesafe;
        byte yolculukTip;
        int yas;
        double yolIndirim = 1;
        double yasIndirim = 1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz: ");
        yas = inp.nextInt();

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = inp.nextDouble();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        yolculukTip = inp.nextByte();

        boolean hesapla = true;
        if (yas < 0 || mesafe < 0 || (yolculukTip < 1 || yolculukTip > 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            hesapla = false;
        }

        if(yas <= 12) {
            yasIndirim = 0.50;
        } else if (yas <= 24) {
            yasIndirim = 0.10;
        } else if(yas > 64) {
            yasIndirim = 0.30;
        } else if(yas < 63) {
            yasIndirim = 1;
        }


        if (yolculukTip == 1) {
            yolIndirim = 1;
        } else if (yolculukTip == 2) {
            yolIndirim = 0.2;
        }


        double toplamTutar, normalTutar, yasTutar, indirimliTutar, biletTutar;

        normalTutar = mesafe * 0.10;
        yasTutar = normalTutar * yasIndirim;
        indirimliTutar = normalTutar - yasTutar;
        biletTutar = indirimliTutar * yolIndirim;
        toplamTutar = (indirimliTutar - biletTutar) * 2;

        if (yolculukTip == 1 && hesapla == true) {
            yolIndirim = 1;
            System.out.println("Toplam tutar: "+normalTutar+ "TL");
        } else if (yolculukTip == 2) {
            yolIndirim = 0.2;
            System.out.println("Toplam tutar: " + toplamTutar + " TL");
        }

    }
}
