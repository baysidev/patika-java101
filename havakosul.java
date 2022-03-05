package Giris;

import java.util.Scanner;
public class havakosul {
    public static void main(String[] args) {

        int temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz: ");
        temp = input.nextInt();

        if(temp < 5){
            System.out.println("Kayak yapabilirsiniz.");

        } else if (temp >= 5 && temp <= 15) {
            System.out.println("Sinemeya gidebilirsiniz.");
        }
         else if (temp >= 15 && temp <= 25) {
            System.out.println("Piknik yapabilirsiniz.");
        }
         else if (temp >= 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
