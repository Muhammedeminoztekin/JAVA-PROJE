import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dairenin yarıçap değerini giriniz : ");
        int r = scan.nextInt();
        double alan= Math.PI*r*r;
        double cevre=Math.PI*r;

        System.out.println("Alan : " + alan);
        System.out.println("Çevre : "+cevre);



    }
}