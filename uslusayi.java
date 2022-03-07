package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class uslusayi {
    public static void main(String[] args) {

        int n, k;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        k = input.nextInt();

        int res = 1;
        for (int i =1; i <= k; i++){
            res *= n;
        }

        System.out.println("Cevap: " +res);


    }
}
