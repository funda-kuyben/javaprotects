//Manav sepet tutarı hesaplama
//kullanıcıların manavdan aldıkları ürünlerin kg değerlerine göre toplam tutarını yazdıran
//salatalık:3,14tl, elma:4,11tl, kabak:2,22tl, domates:0,95tl, patlıcan: 7,00tl

import java.util.Scanner;

public class proje5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cucumber = 3.14;
        double apple = 4.11;
        double pumpkin = 2.22;
        double tomatoe = 0.95;
        double eggplant = 7.00;

        System.out.print("how many kilos of cucumber:");
        double cucumberKilo = scan.nextDouble();
        System.out.print("how many kilos of apple:");
        double appleKilo = scan.nextDouble();
        System.out.print("how many kilos of pumpkin:");
        double pumpkinKilo = scan.nextDouble();
        System.out.print("how many kilos of tomatoe:");
        double tomatoeKilo = scan.nextDouble();
        System.out.print("how many kilos of eggplant:");
        double eggplantKilo = scan.nextDouble();

        double total = (cucumber * cucumberKilo) + (apple * appleKilo) + (pumpkin * pumpkinKilo)
                + (tomatoe * tomatoeKilo) + (eggplant * eggplantKilo);
        System.out.println("toplam tutar: " + total + "tl");
    }
}
