package Giris;
import java.util.Scanner;
/*
baysidev
 */

public class minvemax {
    public static void main(String[] args) {

        int sayigiris;
        int sayi = 1, max = 0, min = 0;
        Scanner giris = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        sayigiris = giris.nextInt();

        for (int i = 1; i <= sayigiris; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = giris.nextInt();

            if(i == 1){
                max = sayi;
                min = sayi;
            } else {
                if (sayi >= max){
                    max = sayi;
                } else if (sayi <= min){
                    min = sayi;
                }
            }

        }

        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);
    }
}
