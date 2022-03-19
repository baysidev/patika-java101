package Giris.boxcomp;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Dövüşcü 1" , 15 , 100, 90, 20);
        Fighter alex = new Fighter("Dövüşcü 2" , 10 , 95, 100, 30);

        Match r = new Match(marc,alex , 90 , 100);
        r.run();
    }
}
