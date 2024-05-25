
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kilonuzu Girin: ");
        int Kilo = scanner.nextInt();
        
        System.out.println("Boyunuzu Girin: ");
        double Boy = scanner.nextDouble();
        
        double bki = Kilo / (Boy * Boy);
        System.out.println("Beden Kitle İndeksi: " + bki);
        
    }
}
