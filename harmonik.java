package Giris;

import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {

        int n;
        double res = 0.0;
        Scanner giris = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");

        n = giris.nextInt();

        for (int i = 1; i <= n; i++){

            res += (1.0/i);
        }
        System.out.println(res);


    }
}
