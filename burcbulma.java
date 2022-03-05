package Giris;
import java.util.Scanner;

public class burcbulma {
    public static void main(String[] args) {

        int gun, ay;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz: ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        gun = input.nextInt();

        switch (ay) {
            case 1:
                if(gun > 0 && gun < 22){
                    System.out.println("Oğlak burcusunuz.");
                } else {
                    System.out.println("Kova burcusunuz.");
                }
                break;
            case 2:
                if(gun > 0 && gun < 20){
                    System.out.println("Kova burcusunuz.");
                } else {
                    System.out.println("Balık burcusunuz.");
                }
                break;
            case 3:
                if(gun > 0 && gun < 21){
                    System.out.println("Balık burcusunuz.");
                } else {
                    System.out.println("Koç Burcusunuz.");
                }
                break;
            case 4:
                if(gun > 0 && gun < 21){
                    System.out.println("Koç burcusunuz.");
                } else {
                    System.out.println("Boğa burcusunuz.");
                }
                break;
            case 5:
                if(gun > 0 && gun < 22){
                    System.out.println("Boğa burcusunuz.");
                } else {
                    System.out.println("İkizler burcusunuz.");
                }
                break;
            case 6:
                if(gun > 0 && gun < 23){
                    System.out.println("İkizler burcusunuz.");
                } else {
                    System.out.println("Yengeç burcusunuz.");
                }
                break;
            case 7:
                if(gun > 0 && gun < 23){
                    System.out.println("Yengeç burcusunuz.");
                } else {
                    System.out.println("Aslan burcusunuz.");
                }
                break;
            case 8:
                if(gun > 0 && gun < 23){
                    System.out.println("Aslan burcusunuz.");
                } else {
                    System.out.println("Başak burcusunuz.");
                }
                break;
            case 9:
                if(gun > 0 && gun < 23){
                    System.out.println("Başak burcusunuz.");
                } else {
                    System.out.println("Terazi burcusunuz.");
                }
                break;
            case 10:
                if(gun > 0 && gun < 23){
                    System.out.println("Terazi burcusunuz.");
                } else {
                    System.out.println("Akrep burcusunuz.");
                }
                break;
            case 11:
                if(gun > 0 && gun < 21){
                    System.out.println("Akrep burcusunuz.");
                } else {
                    System.out.println("Yay burcusunuz.");
                }
                break;
            case 12:
                if(gun > 0 && gun < 22){
                    System.out.println("Yay burcusunuz.");
                } else {
                    System.out.println("Oğlak burcusunuz.");
                }
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");
        }








    }
}
