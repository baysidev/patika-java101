package Giris;

import java.util.Scanner;
public class kuvvetbulma {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= 100; i*=4){
            System.out.print(i+", ");
        }
        for (int i = 1; i <= 100; i*=5){
            System.out.print(i+", ");
        }
    }
}
