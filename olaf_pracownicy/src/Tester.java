public class Tester extends Pracownik {


    public Tester(Etat etat, String nazwisko, int pensja) {
        super(etat, nazwisko, pensja);
    }

    @Override
    public int oblicz_wynagrodzenie() {
        return this.pensja;
    }
}
