public class OpelCorsa extends Opel{
    public OpelCorsa(){
        super();
        this.nr_rejestracyjny="CO_POJEB";

    }

    public void opis(int nr){
        System.out.println("Numer w tablicy: "+ nr +"\n" + "Numer rejestracji: "+ this.nr_rejestracyjny + "\n"
                + "Marka: "+ this.marka + "\n"+ "Ilość samochodów: " + Opel.ilosc_samochodow +" szt." );
    }
}
