//  Daire alan ve çevre hesaplama
//yarıçapı kullanıcıdan alan
//daire alan: pi*r*r, daire çevre: 2*pi*r

import java.util.Scanner;

public class proje6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("dairenin yaricapini giriniz:");
        double yaricap = input.nextDouble();
        double alan = Math.PI * yaricap * yaricap;
        double cevre = 2 * Math.PI * yaricap;
        System.out.println("dairenin çevresi:" + cevre);
        System.out.println("dairenin alani:" + alan);
    }
}
