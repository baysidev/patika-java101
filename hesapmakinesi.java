package Giris;
import java.util.Scanner;


public class hesapmakinesi {
    public static void main(String[] args) {

        int sayi1, sayi2;
        Scanner giris = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        sayi1 = giris.nextInt();

        Scanner giris2 = new Scanner(System.in);
        System.out.print("İkinci sayıyı giriniz:");
        sayi2 = giris2.nextInt();

        Scanner giris3 = new Scanner(System.in);
        System.out.print("İşlem sembolü giriniz (topla +) (çıkar -) (çarp *) (böl /): ");
        String islem = giris3.next();

        switch (islem) {
            case "+", "topla" -> {
                int toplam;
                toplam = sayi1 + sayi2;
                System.out.println("İşlem Sonucu: " + toplam);
            }
            case "-", "çıkar" -> {
                int cikar;
                cikar = sayi1 - sayi2;
                System.out.println("İşlem sonucu: " + cikar);
            }
            case "*", "çarp" -> {
                int carp;
                carp = sayi1 * sayi2;
                System.out.println("İşlem sonucu: " + carp);
            }
            case "/", "böl" -> {
                int bol;
                bol = sayi1 / sayi2;
                System.out.println("İşlem sonucu: " + bol);
            }
            default -> System.out.println("Hatalı işlem girdiniz. ((topla +) (çıkar -) (çarp *) (böl /))");
        }
    }

}
