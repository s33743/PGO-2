//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ksiazka harryPotter=new Ksiazka("Harry Potter","J.K.Rowling", 360, true);
        harryPotter.printInfo();
        Czytelnik janKowalski=new Czytelnik("Jan","Kowalski", 445,4);
        janKowalski.printInfo();
        Czytelnik toddHoward=new Czytelnik("Todd","Howard",45,7);
        toddHoward.printInfo();

        Biblioteka biblioteka = new Biblioteka(20);

        biblioteka.dodajKsiazke(new Ksiazka("Wiedzmin", "Sapkowski", 320, false));
        biblioteka.dodajKsiazke(new Ksiazka("Lalka", "Prus", 450,true));

        biblioteka.wypiszDostepneKsiazki();

        System.out.println("Liczba ksiazek: " + biblioteka.policzDostepneKsiazki());

        Ksiazka znaleziona = biblioteka.znajdzKsiazkePoTytule("Lalka");
        if (znaleziona != null) {
            System.out.println("Znaleziono");
            znaleziona.printInfo();
        } else {
            System.out.println("Nie znaleziono ksiazki");
        }
    }
}

