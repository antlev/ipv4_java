import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by antoine on 02/04/16.
 */
public class Main {

    public static void main(String args[]){

        Window window = new Window();

        // Saisir une adresse ip : x:y:z:q
        int bite1=192,bite2=168,bite3=0,bite4=1;

        ArrayList<Bite> bites = new ArrayList<Bite>();
        bites.add(new Bite(bite1));
        bites.add(new Bite(bite2));
        bites.add(new Bite(bite3));
        bites.add(new Bite(bite4));

        IpAdress ipAdress = new IpAdress(bites);


        // Saisir un masque : x:y:z:q
        int bitemask1=255,bitemask2=255,bitemask3=0,bitemask4=0;

        ArrayList<Bite> bitesMask = new ArrayList<Bite>();
        bites.add(new Bite(bitemask1));
        bites.add(new Bite(bitemask2));
        bites.add(new Bite(bitemask3));
        bites.add(new Bite(bitemask4));

        Mask mask = new Mask(bitesMask);
        // Saisir un masque : cidr
//        Mask mask2 = new Mask(24);

        // Affichage Ip
        ipAdress.printAdress();
        // Affichage Masque
//        mask.printAdress();
        // Affichage Info



    }

}
