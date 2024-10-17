import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double limon;
        double kiraz;
        double kabak;
        double domates;
        double patlıcan;

        System.out.println("Limon kaç kilo : ");
        double  limonkilo = scan.nextDouble();

        System.out.println( "Kiraz kaç kilo : ");
        double kirazkilo = scan.nextDouble();

        System.out.println( "Kabak kaç kilo : ");
        double kabakilo = scan.nextDouble();

        System.out.println( "Domates kaç kilo : ");
        double domateskilo = scan.nextDouble();

        System.out.println( "Patlıcan kaç kilo : ");
        double patlıcankilo = scan.nextDouble();

        double tutar = (limonkilo+kirazkilo+kabakilo+domateskilo+patlıcankilo);
        System.out.println("Sepet tutarı : " +tutar);



    }
}
//bu kod sadece tam sayılar için  yazılmış kısa bir koddur.