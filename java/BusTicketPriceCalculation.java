import java.util.Scanner;

//otobüs bileti fiyatı hesaplayan.
/*kullanıcıdan mesafe(km),yaş ve yolculuk tipi(tek yön,gidiş-dönüş),
 * mesafe başına ücret 0.5 tl/km.
 * kişi 12 yaşından küçükse bilet fiyatı üzerinden %40 indirim.
 * 12-24 yaşları arasında ise %30 indirim
 * 65 yaşından büyükse %20 indirim
 * yolculuk tipi gidiş dönüş seçmiş ise %10 indirim
 */
/*bus ticket price calculator.
*The user is asked for distance (km), age and trip type (one way, round trip),
 * 0.5 tl/km per distance.
 * 40% discount on ticket price if the person is under 12 years old.
 * 30% discount if the person is between 12-24 years old
 * 20% discount if over 65 years old
 * 10% discount if trip type is round trip
 */
public class BusTicketPriceCalculation {
    public static void main(String[] args) {
        double km, age, traveltype, price;
        double ucret = 0.10;
        Scanner input = new Scanner(System.in);
        System.out.println("Km: ");
        km = input.nextFloat();
        System.out.println("Age: ");
        age = input.nextFloat();
        System.out.println("Travel type: ");
        traveltype = input.nextFloat();
        price = ucret * km * traveltype;
        if (traveltype != 1 && traveltype != 2) {
            System.out.println("Hatali veri girdiniz! ");
        } else {
            if (age < 12) {
                price = price - (price * 0.4);
            }
            if (age >= 12 && age <= 24) {
                price = price - (price * 0.3);
            }
            if (age > 65) {
                price = price - (price * 0.2);
            }
            if (traveltype == 2) {
                price = price - (price * 0.1);
            }
            System.out.println("Price: " + price);

        }
    }
}
