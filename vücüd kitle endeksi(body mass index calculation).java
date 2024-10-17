import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Boyunuzu(metre cinsinden)giriniz : ");
        double boy = scan.nextDouble();

        System.out.println("Kilonuzu giriniz : ");
        double kilo = scan.nextDouble();

        double indeks = kilo / (boy * boy);
        System.out.println("Vücud kitle indeksiniz : " + indeks);
    }
}
//bu kod sadece metre cinsinden olan boylar için oluşturulmuş kısa bir nottur.
//This code is a short code created only for lengths in meters.