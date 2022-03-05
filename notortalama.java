package Giris;

import java.util.Scanner;


public class notortalama {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.println("Notlarınızı Verilen Derse Göre Giriniz");
        System.out.println("Matematik: ");
        mat = input.nextInt();

        System.out.println("Fizik: ");
        fizik = input.nextInt();

        System.out.println("Kimya: ");
        kimya = input.nextInt();

        System.out.println("Türkçe: ");
        turkce = input.nextInt();

        System.out.println("Tarih: ");
        tarih = input.nextInt();

        System.out.println("Müzik: ");
        muzik = input.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Matematik: "+mat+ "\nFizik: " +fizik+ "\nKimya: " +kimya+ "\nTürkçe: " +turkce+
        "\nTarih: " +tarih+ "\nMuzik: " +muzik+ "\nNot Ortalaması: " +sonuc);

        boolean sinifGecer = sonuc > 59;
        String sinifSonuc = sinifGecer ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sinifSonuc);

    }
}
