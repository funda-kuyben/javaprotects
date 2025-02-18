import java.util.Scanner;
import java.util.Random;

public class numberGuessingGame {
    public static void main(String[] args) {
        // Generate a random number (between 1-100)
        Random random = new Random();
        int rastgeleSayi = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int tahmin;
        int denemeSayisi = 0;

        System.out.println("1 ile 100 arasinda bir sayi tuttum.tahmin etmeye calis.");
        System.out.println("dogru tahmini bulana kadar devam edebilirsin.");

        do {
            System.out.println("Tahmininizi girin: ");
            tahmin = scanner.nextInt();
            denemeSayisi++;

            if (tahmin > rastgeleSayi) {
                System.out.println("daha kücük bir sayi girin.");
            } else if (tahmin < rastgeleSayi) {
                System.out.println("daha büyük bir sayi girin");
            } else {
                System.out.println("tebrikler! " + denemeSayisi + " denemede doğru tahmini buldunuz.");
            }
        } while (tahmin != rastgeleSayi);
        scanner.close();

    }
}
