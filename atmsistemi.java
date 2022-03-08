package Giris;

import java.util.Scanner;

public class atmsistemi {
    public static void main(String[] args) {

        String userName, pass;
        int right = 3;
        int balance = 1500;
        int req;
        boolean exit = false;

        Scanner giris = new Scanner(System.in);


        while (right > 0) {

            System.out.print("Kullanıcı adı giriniz: ");
            userName = giris.nextLine();
            System.out.print("Şifre giriniz: ");
            pass = giris.nextLine();

            if (userName.equals("patika") && pass.equals("dev123")) {
                System.out.println("Giriş başarılı. Kodluyoruz bankasına hoş geldiniz!");
                System.out.println("Yapmak istediğiniz işlemi giriniz:");

                do {
                    System.out.println("""
                            1-Para yatırma
                            2-Para Çekme
                            3-Bakiye Sorgula
                            4-Çıkış Yap""");
                    req = giris.nextInt();
                    switch (req) {
                        case 1 -> {
                            int amount;
                            System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                            amount = giris.nextInt();
                            balance += amount;
                            System.out.println(amount + "TL yatırıldı. Yeni bakiye: " + balance);
                        }
                        case 2 -> {
                            int withdraw;
                            System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                            withdraw = giris.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Yeterli bakiyeniz yok. Bakiye: " + balance);
                            } else {
                                balance -= withdraw;
                                System.out.println("Hesabınızdan " + withdraw + "TL çekildi. Yeni bakiye: " + balance + "TL");
                            }
                        }
                        case 3 -> System.out.println("Hesabınızda bulunan tutar: " + balance + " TL");
                        case 4 -> {
                            System.out.println("Başarıyla çıkış yaptınız.");
                            right = 0;
                            exit = true;
                        }
                    }

                } while (right > 0);

            } else {
                right--;
                System.out.println("Kullanıcı adı veya şifre hatalı. Tekrar deneyin. Kalan giriş hakkı (" + right + "/3)");
            }
            if (right == 0 && !exit) {
                System.out.println("Giriş hakkınız dolmuştur.");
            }

        }
    }
}

/* baysidev */
