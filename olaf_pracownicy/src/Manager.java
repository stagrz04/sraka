public class Manager extends Pracownik {

    public int dodatek_do_pensji;


    public Manager(Etat etat, String nazwisko, int pensja, int dodatek_do_pensji) {
        super(etat, nazwisko, pensja);
        this.dodatek_do_pensji = dodatek_do_pensji;
    }

    @Override
    public int oblicz_wynagrodzenie() {
        return this.pensja + this.dodatek_do_pensji;
    }

    public int oblicz_premie_swiateczna(Pracownik[] pracownicy) {
        int premie = 0;
        for (int i = 0; i < pracownicy.length; i++) {
            if (pracownicy[i] instanceof Manager) {
                premie += 1000;
            } else {
                premie += 300;
            }
        }
        return premie;
    }
}
