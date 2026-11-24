import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner czytajZKlawiatury = new Scanner(System.in);

        System.out.print("Podaj nazwe pliku: ");
        String nazwaPliku = czytajZKlawiatury.nextLine();

        File plik = new File(nazwaPliku);

        Scanner czytajZPliku = new Scanner(plik);

        while (czytajZPliku.hasNextLine()){
            String linia = czytajZPliku.nextLine();
            System.out.println(linia);
        }
        czytajZKlawiatury.close();
        czytajZPliku.close();
    }
}
