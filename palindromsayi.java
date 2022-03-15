package Giris.metot;

import java.util.Scanner;

public class palindromsayi {

    static boolean isPalindrom(int number){

        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber){
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        int sayi;
        Scanner giris = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = giris.nextInt();

        if(isPalindrom(sayi)){
            System.out.println(sayi+ " palindrom sayıdır.");

        } else {
            System.out.println(sayi+ " palindrom sayı değildir.");
        }


    }
}
