import java.util.Scanner;

public class klasa_główna {

    public Pracownik[] pracownicy;

    public klasa_główna() {
        this.pracownicy = null;
    }

    public void dodaj_pracownika() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj typ nowego pracownika:");
        String typ = scanner.nextLine();
        if (typ.equals("Manager")) {
            this.pracownicy = helper();
            this.pracownicy[this.pracownicy.length - 1] = new Manager(Pracownik.Etat.PELEN, "Milosz", 10, 10000);
        } else if (typ.equals("Tester")) {
            this.pracownicy = helper();
            this.pracownicy[this.pracownicy.length - 1] = new Tester(Pracownik.Etat.PELEN, "Skurwiel", 2);
        } else {
            throw new NoClassDefFoundError("Nie ma takiej klasy jak: " + typ);
        }

        Pracownik.liczba_pracowników++;
    }

    private Pracownik[] helper() {
        if (this.pracownicy==null){
            return new Pracownik[1];
        }
        Pracownik[] pracownicy = new Pracownik[this.pracownicy.length + 1];

        for (int i = 0; i < this.pracownicy.length; i++) {
            pracownicy[i] = this.pracownicy[i];
        }
        return pracownicy;
    }

    public static void main(String[] args) {
        klasa_główna klasa = new klasa_główna();
        int i = 0;
        while (i < 3) {
            klasa.dodaj_pracownika();
            i++;
        }
        int wynagrodzenie = 0;
        for (Pracownik p : klasa.pracownicy) {
            wynagrodzenie += p.oblicz_wynagrodzenie();
        }
        System.out.println("Wynagrodzenie dla tabeli pracowników wynosi: " + wynagrodzenie + " zł");

        for (Pracownik p : klasa.pracownicy) {
            if (p instanceof Manager) {
                System.out.println("Premia świąteczna w tym roku wynosi: " + ((Manager) p).oblicz_premie_swiateczna(klasa.pracownicy) + " zł");
                return;
            }
        }
        System.out.println("Ta tablica nie ma Managera, przez co nie można obliczyć premii :(");
    }

}

