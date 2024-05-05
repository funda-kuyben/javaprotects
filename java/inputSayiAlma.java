import java.util.Scanner;

public class inputSayiAlma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.println("A sayisini girin: ");
        a = input.nextInt();

        System.out.println("B sayisini girin: ");
        b = input.nextInt(); // dextdouble=>3.14 nextLine=>string

        System.out.println("A sayisi: " + a);
        System.out.println("B sayisi: " + b);

    }
}
