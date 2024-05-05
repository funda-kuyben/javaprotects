//VAT price and VAT amount of the amount received from the user (vat=12%)

import java.util.Scanner;

public class KdvliTutarHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tutar girin: ");
        double amount = input.nextDouble();
        System.out.println("KDV orani: %12");
        double vatamount = amount * 0.12;
        System.out.println("KDV tutari: " + vatamount);
        double amountwithvat = amount + vatamount;
        System.out.println("KDV'li tutar: " + amountwithvat);
    }
}
