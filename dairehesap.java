package Giris;
import java.util.Scanner;

/*
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;


 */

public class dairehesap {
    public static void main(String[] args) {
        double piSayi = 3.14;
        int yariCap;
        int merkezAci;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarı çap değerini giriniz: ");
        yariCap = input.nextInt();

        Scanner giris = new Scanner(System.in);
        System.out.print("Merkez açı değerini giriniz: ");
        merkezAci = input.nextInt();

        double alan, cevre, dilimAlan;
        alan = piSayi * yariCap * yariCap;
        cevre = 2 * piSayi * yariCap;
        dilimAlan = (piSayi * (yariCap * yariCap) * merkezAci) / 360;

        System.out.println("Üçgenin yarı çapı: "+yariCap+ "\nÜçgenin alanı: "+alan+ "\nÜçgenin çevresi: "+cevre+
        "\nÜçgenin merkez açı değeri: "+dilimAlan);

    }
}
