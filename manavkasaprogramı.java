package Giris;
import java.util.Scanner;

public class manavkasaprogramı {
    public static void main(String[] args) {

        int kilogram;
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        int armutKg , elmaKg , domatesKg , muzKg , patlicanKg;

        Scanner giris = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        armutKg = giris.nextInt();

        Scanner giris2 = new Scanner(System.in);
        System.out.print("Elma Kaç Kilo ? :");
        elmaKg = giris2.nextInt();

        Scanner giris3 = new Scanner(System.in);
        System.out.print("Domates Kaç Kilo ? :");
        domatesKg = giris3.nextInt();

        Scanner giris4 = new Scanner(System.in);
        System.out.print("Muz Kaç Kilo ? :");
        muzKg = giris4.nextInt();

        Scanner giris5 = new Scanner(System.in);
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanKg = giris5.nextInt();

        double toplam;
        toplam = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);
        System.out.println("Toplam Tutar : "+toplam+ " TL");


    }
}
