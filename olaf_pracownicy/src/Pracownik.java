public abstract class Pracownik {
    enum Etat{
        PELEN,POL,KWARTA
    }

    public Etat etat;
    protected static int liczba_pracowników=0;
    public String nazwisko;
    public int pensja;
public Pracownik (Etat etat, String nazwisko, int pensja){
    this.etat=etat;
    this.nazwisko=nazwisko;
    this.pensja=pensja;
}
    public abstract int oblicz_wynagrodzenie();

}
