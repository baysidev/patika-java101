package Giris;

import java.util.Scanner;

public class teksayibulma {
    public static void main(String[] args) {

        int n;
        int toplam = 0;

        Scanner giris = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            n = giris.nextInt();

            if(n % 4 == 0){

                toplam += n;
            }
        } while(n %2 == 0);

        System.out.println("Toplam: "+toplam);
        

    }
}
