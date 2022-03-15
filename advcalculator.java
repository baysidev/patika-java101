package Giris.metot;
import java.util.Scanner;

/*
1- Toplama İşlemi
2- Çıkarma İşlemi
3- Çarpma İşlemi
4- Bölme işlemi
5- Üslü Sayı Hesaplama
6- Faktoriyel Hesaplama
7- Mod Alma
8- Dikdörtgen Alan ve Çevre Hesabı
 */


public class advcalculator {

    static void plus() {

        Scanner input = new Scanner(System.in);
        int num, res = 0, x;

        System.out.print("Kaç adet sayı gireceksiniz: ");
        x = input.nextInt();

        for (int i = 1; i <= x; i++) {

            System.out.print(i + ". sayı: ");
            num = input.nextInt();
            res += num;

        }

        System.out.println("Sonuç: " + res);

    }

    static void minus() {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int x = input.nextInt();
        int num, res = 0;

        for (int i = 1; i <= x; i++) {
            System.out.print(i + ". sayı: ");
            num = input.nextInt();

            if (i == 1) {
                res += num;
                continue;
            }

            res -= num;

        }

        System.out.println("Sonuç: " + res);

    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void getmod(){

        int mod, modUst;
        Scanner giris = new Scanner(System.in);
        System.out.print("Modu alınacak sayıyı giriniz: ");
        mod = giris.nextInt();

        System.out.print("Sayıyı bölecek sayıyı giriniz: ");
        modUst = giris.nextInt();

        int res = 0;

        res = mod % modUst;

        System.out.println("Sonuç: " + res);

    }

    static void rectanlecal(){

        int shortCorner, longCorner;
        Scanner giris = new Scanner(System.in);
        System.out.print("Kısa kenar uzunluğunu giriniz: ");
        shortCorner = giris.nextInt();

        System.out.print("Uzun kenar uzunluğunu giriniz: ");
        longCorner = giris.nextInt();

        int area = 0, circle = 0;

        area = (shortCorner * longCorner);
        circle = 2 * (shortCorner + longCorner);

        System.out.println("Dairenin alanı: "+area+ " Dairenin çevresi: "+circle);
    }


    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        int choose;
        String menu = """
                1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme işlemi
                5- Üslü Sayı Hesaplama
                6- Faktoriyel Hesaplama
                7- Mod Alma
                8- Dikdörtgen Alan ve Çevre Hesabı
                0- Çıkış Yap""";

        do {
            System.out.println(menu);
            System.out.println("Lütfen bir işlem seçiniz: ");
            choose = giris.nextInt();

            switch (choose) {

                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    getmod();
                    break;
                case 8:
                    rectanlecal();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }


        } while (choose != 0);


    }
}

