import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. feladat
        System.out.println("1. feladat");
        System.out.print("Adja meg az aktivitását: ");
        String aktivitás = sc.nextLine().trim().toUpperCase();

        // 2. feladat
        int táv = 0;
        Set<Character> mozgásformák = new HashSet<>();
        for (char c : aktivitás.toCharArray()) {
            mozgásformák.add(c);
            switch (c) {
                case 'U': táv += 1; break;
                case 'G': táv += 1; break;
                case 'F': táv += 2; break;
                case 'K': táv += 10; break;
            }
        }
        System.out.println("2. feladat");
        System.out.println("Az elért távolság: " + táv + " km.");

        // 3. feladat
        int jutalom = 0;
        if (mozgásformák.contains('U') && mozgásformák.contains('G') &&
                mozgásformák.contains('F') && mozgásformák.contains('K')) {
            jutalom = 10;
            System.out.println("3. feladat");
            System.out.println("Bravó! Jutalma még 10 km.");
        } else {
            System.out.println("3. feladat");
            System.out.println("Nem jár jutalom.");
        }

        // 4. feladat
        int eredmény = táv + jutalom;
        System.out.println("4. feladat");
        System.out.print("Eredménye: " + eredmény + " km. ");
        if (eredmény >= 40) {
            System.out.println("Gratulálok, kihívás teljesítve!");
        } else {
            System.out.println("Legközelebb sikerül!");
        }
    }
}