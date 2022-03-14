package Giris;
import java.util.Scanner;

public class muksayi {
    public static void main(String[] args) {

        int sayi;
        int topla = 0;
        Scanner giris = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = giris.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {

                topla = i + topla;


            }
        }
        if (topla == sayi){
            System.out.println(sayi+ " mükemmel sayıdır.");
        } else {
            System.out.println(sayi+ " mükemmdel sayı değildir.");
        }

    }
}
