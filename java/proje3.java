
//Hipotenüs hesaplama
//Kullanıcıdan dik kenarların uzunluğunu alan ve üçgene ait hipotenüsü hesaplama
import java.util.Scanner;

public class proje3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1.kenari girin: ");
        int a = scan.nextInt();

        System.out.print("2.kenari girin: ");
        int b = scan.nextInt();
        // c*c=(a*a)+(b*b), Math.sqrt()

        double c = Math.sqrt((a * a) + (b * b));
        System.out.println("hipotenüs: " + (int) c);
    }
}
