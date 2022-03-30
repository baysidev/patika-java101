package Giris.others;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/*
baysidev
 */


public class sayitahmin {

    public static void main(String[] args) {

        int tahminHak = 0;
        int tahminSayi;
        Random rand = new Random();
        int gercekSayi = rand.nextInt(100);

        Scanner scan = new Scanner(System.in);

        int[] hatali = new int[5];


        while (tahminHak < 5) {


            System.out.print("Tahmin ettiğiniz sayıyı giriniz: ");
            tahminSayi = scan.nextInt();


            if(tahminSayi < 1 || tahminSayi > 99) {

                System.out.println("Sadece 1 ve 100 arası değerleri girebilirsiniz.");

            } else {

                if (tahminSayi == gercekSayi) {

                    System.out.println("Tahmin doğru! Tahmin edilen sayı: " + tahminSayi + " Gerçek sayı: " + gercekSayi);
                    hatali[tahminHak++] = tahminSayi;
                    break;
                } else {


                    System.out.println("Tahmininiz yanlış! Kalan hakkınız: (" + (tahminHak + 1) + "/5)");
                    hatali[tahminHak++] = tahminSayi;


                    if (tahminSayi < gercekSayi) {
                        System.out.println(tahminSayi + " sayısı, gerçek sayıdan küçüktür.");

                    } else {
                        System.out.println(tahminSayi + " sayısı, gerçek sayıdan büyüktür.");
                    }
                }

                if (tahminHak == 5) {
                    System.out.println("Tahmin hakkınız doldu. Oyunu kaybettiniz.");

                }

            }
        }

        System.out.println("Tahminleriniz : " + Arrays.toString(hatali));
        System.out.println("Gerçek sayı: "+gercekSayi);
    }

}
