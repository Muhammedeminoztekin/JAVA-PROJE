import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("1.kenarı gir : ");
        int a= scan.nextInt();

        System.out.println("2.kenarı gir : ");
        int b= scan.nextInt();

        double c= Math.sqrt((a*a)+(b*b));

       System.out.println("Hipotenüs : " + (int)c);

    }
}
//Bu kod özel üçkenler için yazılmış kısa bir programdır.