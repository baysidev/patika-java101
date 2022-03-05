package Giris;
import java.util.Scanner;


public class kullanicigiris {
    public static void main(String[] args) {

        String kullaniciAd, kullaniciSifre, kullaniciYeniSifre;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz: ");
        kullaniciAd = inp.nextLine();

        System.out.print("Şifre giriniz: ");
        kullaniciSifre = inp.nextLine();

        if (kullaniciAd.equals("patika") && kullaniciSifre.equals("java123")) {

            System.out.println("Giriş başarılı.");

        } else {

            System.out.println("Bilgileriniz yanlış.");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır)");
            Scanner giris = new Scanner(System.in);
            String cevap = giris.nextLine();

            switch (cevap) {
                case "Evet" -> {
                    Scanner giris2 = new Scanner(System.in);
                    System.out.println("Yeni şifrenizi giriniz: ");
                    kullaniciYeniSifre = giris2.nextLine();
                    if (kullaniciYeniSifre.equals("java123")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu");

                    }
                }
                case "Hayır" -> System.out.println("Çıkış yapılıyor.");
                default -> System.out.println("Hatalı cevap.");
            }

        }

    }

}
