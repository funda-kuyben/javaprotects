
//not ortalaması hesaplama
//fizik,matematik,türkçe,kimya,müzik,tarih derslerinin sınav puanlarını kullanıcıdan alan ve bu derslerin ortalamalarını hesaplayıp yazdıran
import java.util.Scanner;

public class proje1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fizik, matematik, turkce, kimya, muzik, tarih;

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        double ort = (fizik + matematik + turkce + kimya + muzik + tarih) / 6.0;
        System.out.println("Ortalamaniz: " + ort);

        // Ortalama 60 veya daha büyükse "geçtiniz" mesajı
        while (ort >= 60) {
            System.out.println(ort + " ortalama ile geçtiniz.");
            break; // Döngüyü sona erdir
        }

        // Ortalama 60'tan küçükse "kaldınız" mesajı
        while (ort < 60) {
            System.out.println(ort + " ortalama ile kaldiniz.");
            break; // Döngüyü sona erdir
        }
    }
}