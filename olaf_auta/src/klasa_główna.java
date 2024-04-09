import java.util.Random;
import java.util.Scanner;

public class klasa_główna {

    public static  void działaj (Opel[] auta){
        Random random = new Random();
        for (Opel o : auta){
            o.zmienBieg(random.nextInt(2,7), random.nextInt() % 2 == 0);
        }

    }

    public static void main(String[] args) throws ClassNotFoundException {
        Opel [] auta= new Opel[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj typ pierwszego obiektu:");
        String podane =  scanner.nextLine();
        if (podane.equals("Opel")){
        auta[0]= new Opel();
        } else if (podane.equals("OpelCorsa")) {
            auta[0]= new OpelCorsa();
        }else {
            throw new ClassNotFoundException("Typ: " + podane + " nie istnieje");
        }
        auta[1]=new Opel();
        auta[2]= new OpelCorsa();
        działaj(auta);
        int i = 0;
        for(Opel o : auta){
            if (o instanceof OpelCorsa){
                ((OpelCorsa) o).opis(i);
            }
            i++;
        }

    }
}
