package Giris.metot;
import java.util.Scanner;

public class usrecursive {

    static void usal(int x, int y){

        int res = 1;

        for (int i = 1; i <= y; i++){
            res *= x;

        }
        System.out.println("Sonuç: "+res);
    }

    public static void main(String[] args) {

        int x, y;
        Scanner giris = new Scanner(System.in);
        System.out.print("Taban sayısı giriniz: ");
        x = giris.nextInt();
        System.out.print("Üs giriniz: ");
        y = giris.nextInt();
        usal(x, y);

    }
}
