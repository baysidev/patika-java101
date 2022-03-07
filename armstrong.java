package Giris;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, numberTotal = 0;

        System.out.print("Sayı giriniz: ");
        a = input.nextInt();

        if(a > 9) {
            while (a != 0) {
                b = a % 10;
                a /= 10;
                numberTotal += b;
            }
        }

        System.out.print("Sonuç = " + numberTotal);

    }
}


        /*
        int a = 2451, basamakSayisi = 0, numberCounter = 0;

        // Basamak Sayısı Bulma İşlemi
        // 2451 / 10 = 245
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0
        // 0 / 10 = 0

        while (a != 0) {
            a /= 10;
            numberCounter++;
        }

        // Bir sayının son basamağını bulma
        // 2451 % 10 = 1
        int b = 2451;
        int c = b % 10;

        int sub = 2, sup = 3;
        int result = 1;
        for (int i = 1; i <= sup; i++ ){
            result *= sub;
        }
        System.out.println(result);
    }
*/
