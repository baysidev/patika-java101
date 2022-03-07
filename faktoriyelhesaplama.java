package Giris;

import java.util.Scanner;
public class faktoriyelhesaplama {
    public static void main(String[] args) {

        int sayi, sayi2;

        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyel sayısını giriniz: ");
        sayi = input.nextInt();
        System.out.print("Faktöriyel sayısını giriniz: ");
        sayi2 = input.nextInt();

        int total = 1;
        int total2 = 1;
        int total3 = 1;

        for (int i = 1; i <= sayi; i++){
            total = total * i;
        }

        for (int i = 1; i <= sayi2; i++){
            total2 = total2 * i;
        }

        for (int i = 1; i <= sayi - sayi2; i++){
            total3 = total3 * i;
        }

        int res;
        res = total / (total2 * total3);
        System.out.println("C("+sayi+","+sayi2+") = "+res);

    }
}
