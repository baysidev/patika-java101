package Giris;
import java.util.Scanner;

public class asalsayil {
    public static void main(String[] args) {


        int bolen = 0;
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < 100; j++)
                if (i % j == 0)
                    bolen++;
            if (bolen < 2)
                System.out.print(i + ", ");
            bolen = 0;

        }

    }
}

