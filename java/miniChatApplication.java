import java.util.Scanner;

public class miniChatApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mini Chat Uygulamasina hoş geldiniz!");
        System.out.println("Bu uygulamada iki kullanici sirayla mesaj yazabilir.");
        System.out.println("Çikmak için \"cikis\" yazabilirsiniz.");

        String kullanici1, kullanici2;

        // kullanici adlarini al
        System.out.print("Birinci kullanicinin adini girin:");
        String ad1 = scanner.nextLine();

        System.out.println("İkinci kullanicin adini girin: ");
        String ad2 = scanner.nextLine();

        while (true) {
            // birinci kullanicidan mesaj al
            System.out.print(ad1 + ": ");
            kullanici1 = scanner.nextLine();

            // cikis kontrolü
            if (kullanici1.equalsIgnoreCase("cikis")) {
                System.out.println("Sohbet sona erdi.Görüşmek üzere");
                break;
            }
            // mesaji göster
            System.out.println(ad2 + " icin mesaj: " + kullanici1);

            // ikinci kullanicidan mesaj al
            System.out.print(ad2 + ": ");
            kullanici2 = scanner.nextLine();

            // çikis kontrolü
            if (kullanici2.equalsIgnoreCase("cikis")) {
                System.out.println("Sohbet sona erdi.görüşmek üzere");
                break;
            }

            // mesaji göster
            System.out.println(ad1 + "icin mesaj: " + kullanici2);
        }
        scanner.close();
    }
}
