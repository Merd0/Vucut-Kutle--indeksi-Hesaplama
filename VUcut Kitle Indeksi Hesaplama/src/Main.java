import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double kilo,boy,indeks;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kilonuzu Girniz: ");
        kilo = inp.nextDouble();

        System.out.print("Boyunuzu Giriniz :");
        boy = inp.nextDouble();

        indeks = kilo / ( boy * boy);
        System.out.print("Vucüt kitle indeksiniz :" + indeks);

        }
    }
