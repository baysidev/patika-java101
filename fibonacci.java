package Giris.donguler;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("Hesaplanacak eleman sayısını giriniz : ");

        int sayi = scanner.nextInt();
        int sayi1 = 0;
        int sayi2 = 1;
        int a = 0, b = 1;

        int result=0;
        System.out.print(sayi1+" "+sayi2+" ");
        for (int i = 2; i < sayi; i++) {
            result=a+b;
            System.out.print(result+" ");
            a=b;
            b=result;
        }

    }
}
