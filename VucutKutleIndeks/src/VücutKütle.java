import java.util.Scanner;
public class VücutKütle {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        double kilo, boy, indeks;

        System.out.print("Kilonuzu Giriniz: ");
        kilo=inp.nextDouble();
        System.out.print("Boyunuzu Giriniz: ");
        boy=inp.nextDouble();
        indeks=kilo/(boy*boy);
        System.out.print("Vücut Kütle İndeksiniz: "+indeks);

    }
}
