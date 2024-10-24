import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Faktöriyel sayısı : ");
      int n= input.nextInt();
      int result= 1;

      for(int i=1;i<=n;i++){
          result *=i;
      }
      System.out.print("Sonuç"+result);
    }
}
//faktoriyel konusu ile hesaplama için kısa bir  kod yazdık.
//kullanıcıdan veri almayla başlayıp for döngüsüyle bitirdik.