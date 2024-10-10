import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int fizik,matematik,türkçe,kimya,muzik,tarih;
       System.out.print("Fizik notunuz : ");
       fizik = input.nextInt();

       System.out.print("Matematik notunuz : ");
       matematik = input.nextInt();

       System.out.print("Türkçe Notunuz : ");
       türkçe = input.nextInt();

       System.out.print("Kimya Notunuz : ");
       kimya = input.nextInt();

       System.out.print("Müzik Notunuz :  ");
       muzik = input.nextInt();

       System.out.print("Tarih Notunuz : ");
       tarih = input.nextInt();

        double sonuc =(fizik+matematik+türkçe+kimya+muzik+tarih) /6;

         System.out.print("Ortalamanız : " +sonuc)      ;

    }
}