//KDV tutarı hesaplama
//kullanıcıdan alınan tutarın KDV'li fiyatını ve KDV tutarını hesaplayan ve ekrana bastıran
//girilen tutar 0 ve 500 arasında ise KDV oranı %18, tutar 500TL'den büyük ise KDV oranı %8

import java.util.Scanner;

public class proje2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price, total, kdvPrice, rate = 0;

        System.out.print("tutar giriniz:");
        price = input.nextDouble();

        if (price >= 0 && price <= 500) {
            rate = 18;
        } else if (price > 500) {
            rate = 8;
        }

        kdvPrice = price * (rate / 100);
        total = kdvPrice + price;

        System.out.println("KDV orani : %" + (int) rate);
        System.out.println("KDV tutari:" + kdvPrice);
        ;
        System.out.println("KDV'li Tutar: " + total);
    }
}
