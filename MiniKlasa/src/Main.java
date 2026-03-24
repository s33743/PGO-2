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



        }
    }