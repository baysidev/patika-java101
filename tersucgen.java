package Giris;
import java.util.Scanner;

public class tersucgen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz: ");
        int sayi = input.nextInt();

        for (int i = sayi; i >= 1; i--) {

            for (int h = 1; h <= (sayi - i); h++) {
                System.out.print(" ");
            }
            for (int g = (2 * i) - 1; g >= 1; g--) {

                System.out.print("*");
            }
            System.out.println();

        }
    }
}
