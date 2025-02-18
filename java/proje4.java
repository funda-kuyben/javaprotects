//Vücut kitle indeksi hesaplama
//kullanıcıdan boy ve kilo değerlerini alarak "vücut kitle indeks" ini hesaplama
//formül: kilo(kg)/ boy(m)* boy(m)

import java.util.Scanner;

public class proje4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("boy(metre): ");
        double boy = scan.nextDouble();

        System.out.print("kilo: ");
        double kilo = scan.nextDouble();

        double indeks = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz: " + indeks);
        if (indeks < 18.5) {
            System.out.println("zayif");
        } else if (indeks >= 18.5 && indeks <= 24.9) {
            System.out.println("ideal");
        } else if (indeks >= 25 && indeks <= 29.9) {
            System.out.println("şişman");
        } else if (indeks >= 30 && indeks <= 34.9) {
            System.out.println("obez");
        } else if (indeks > 35) {
            System.out.println("aşiri obez");
        }
    }

}
