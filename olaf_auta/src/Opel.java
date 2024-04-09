public class Opel implements  uklad_zmiany_biegow{
    final public String marka= "Opel";
    public static int ilosc_samochodow=0;
    public String nr_rejestracyjny;

    public Opel(){
        ilosc_samochodow+=1;
    }
    @Override
    public void zmienBieg(int aktualny_bieg, boolean zw_zm) {
        System.out.println(marka + " zmienia bieg z "+ aktualny_bieg + " na " + helper(aktualny_bieg,zw_zm));
    }

    private int helper (int acc, boolean zw_zm){
        return  zw_zm ? ++acc : --acc;
    }
}
