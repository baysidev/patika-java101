package Giris;

import java.util.Scanner;

public class sayisorgu {
    public static void main(String[] args) {

        int k;
        Scanner giris = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        k = giris.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i%12 == 0) {
                if(i != 0){
                    System.out.print(i+ ", ");
                }
            } else {
                continue;
            }

        }
    }
}
