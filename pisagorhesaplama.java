package Giris;
import java.util.Scanner;

public class pisagorhesaplama {
    public static void main(String[] args) {

        double kenar1, kenar2, hipo;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci kenar uzunluğunu giriniz: ");
        kenar1 = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        kenar2 = input.nextInt();

        hipo = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.println("Hipotenüs: "+hipo);

        double cevre, alan, alanCarpan;
        cevre = (hipo+ kenar1+ kenar2) / 2;
        System.out.println("Üçgenin Çevresi: "+cevre);

        alanCarpan = cevre * (cevre - kenar1) * (cevre - kenar2) * (cevre - hipo);
        alan = Math.sqrt(alanCarpan);
        System.out.println("Üçgenin Alanı: "+alan);

    }
}
