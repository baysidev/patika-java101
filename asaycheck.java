package Giris.metot;

import java.util.Scanner;

public class asaycheck {

   static void isAsal(){

       int sayi;
       int count = 0;
       Scanner giris = new Scanner(System.in);
       System.out.print("Sayı giriniz: ");
       sayi = giris.nextInt();

       for (int i = 1; i < sayi; i++){
           for (int j = 1; j < i; j++){
               if(i % j == 0){
                   count++;
               }
           }
       }

       if (count < 2){
           System.out.println(sayi+" asal sayıdır.");
       } else {
           System.out.println(sayi+" asal sayı değildir.");
       }

   }

    public static void main(String[] args) {

        isAsal();
    }
}

/* 
package Giris.metot;

import java.util.Scanner;

public class asaycheck {

   static void isAsal(int sayi){

       int count = 0;

       for (int i = 1; i < sayi; i++){
           for (int j = 1; j < i; j++){
               if(i % j == 0){
                   count++;
               }
           }
       }

       if (count < 2){
           System.out.println(sayi+" asal sayıdır.");
       } else {
           System.out.println(sayi+" asal sayı değildir.");
       }

   }

    public static void main(String[] args) {

        isAsal(27);
        isAsal(2);
        isAsal(17);
    }
}

*/
