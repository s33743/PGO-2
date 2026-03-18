public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna ){
this.tytul = tytul;
this.autor = autor;
this.liczbaStron = liczbaStron;
this.dostepna = dostepna;
    }

    public void printInfo() {
        System.out.println("Tytul: " + this.tytul);
        System.out.println("Autor: " + this.autor);
        System.out.println("Liczba stron: " + this.liczbaStron);
        System.out.println("Czy dostępna: " + this.dostepna);

    }
}
