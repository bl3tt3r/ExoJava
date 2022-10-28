import com.animal.Crocodile;
import com.animal.Vache;
import com.enclos.Enclos;
import com.enclos.Plaine;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Enclos> enclos = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        Plaine jardin = new Plaine();

        jardin.addAnimal(new Crocodile("Croco"));

        Vache fleur  = new Vache("Fleur");

        if(jardin.peutAccueillir(fleur)) {
            jardin.addAnimal(new Vache("Fleur"));
        }

        jardin.afficherAnimaux();

        enclos.add( jardin );



    }

}