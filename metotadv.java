package Giris.metot;
import java.util.Scanner;

public class metotadv {

    static void lowerNum(int a){

        int counter;

        counter = a / 5;

        if(a > 0) {
            System.out.print(a + " ");

            for (int i = 1; i <= counter * 2; i++) {

                a -= 5;
                System.out.print(a + " ");

            }

        } else {

            System.out.print(a + " ");

            for (int i = 1; i <= counter * -2; i++) {

                a += 5;
                System.out.print(a + " ");

            }

        }


    }

    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int a = giris.nextInt();

        lowerNum(a);
    }



}
