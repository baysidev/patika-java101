package Giris;
import java.util.Scanner;


public class sinifsorgu {

    public static void main(String[] args) {

        double  mat, fiz, tur, kim, muz;
        double gecmeNot = 55;

        Scanner giris = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = giris.nextInt();
        if(mat < 0 && mat > 100){

            mat = 0.00;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fiz = giris.nextInt();
        if(fiz < 0 && fiz > 100){

            fiz = 0.00;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        tur = giris.nextInt();
        if(tur < 0 && tur > 100){

            tur = 0.00;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kim = giris.nextInt();
        if(kim < 0 && kim > 100){

            kim = 0.00;
        }

        System.out.print("Muzik notunuzu giriniz: ");
        muz = giris.nextInt();
        if(muz < 0 && muz > 100){

            muz = 0.00;
        }

        double ortalama = (mat+ fiz+ tur+ kim+ muz) / 5;
        if (ortalama < gecmeNot){
            System.out.println("Sınıfta kaldınız. Ortalama: "+ortalama);

        } else {
            System.out.println("Sınıfı geçtiniz. Ortalama: "+ortalama);
        }

    }
}
