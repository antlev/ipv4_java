import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by antoine on 02/04/16.
 */
public class Main {

    public static void main(String args[]){


        // Saisir une adresse ip : x:y:z:q
        int bite1=192,bite2=168,bite3=0,bite4=1;

        ArrayList<Bite> bites = new ArrayList<Bite>();
        bites.add(new Bite(bite1));
        bites.add(new Bite(bite2));
        bites.add(new Bite(bite3));
        bites.add(new Bite(bite4));

        IpAdress ipAdress = null;
        try {
            ipAdress = new IpAdress(bites);
        } catch (Exception e) {
            e.printStackTrace();
        }


        // Saisir un masque : x:y:z:q
        int bitemask1=255,bitemask2=255,bitemask3=0,bitemask4=0;

        ArrayList<Bite> bitesMask = new ArrayList<Bite>();
        bitesMask.add(new Bite(bitemask1));
        bitesMask.add(new Bite(bitemask2));
        bitesMask.add(new Bite(bitemask3));
        bitesMask.add(new Bite(bitemask4));

//        Mask mask = new Mask();
//        mask.setAdress(bitesMask);
//        // Saisir un masque : cidr
//        Mask mask2 = new Mask();
//        System.out.println("mask2 has been set : "+mask2.setMaskUsingCidr((short)24));

        // Affichage Ip
        System.out.printf("ip>");
        if(ipAdress.isValid()){
            System.out.println(".??");
            ipAdress.printAdress();
        }
        System.out.println("this adress is valid : " + ipAdress.isValid());

        System.out.println("nextAdress !");
        try {
            ipAdress.nextAdress().printAdress();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Affichage Masque
//        System.out.println("mask>");
//        mask.printAdress();
//        System.out.println("mask2>");
//        mask2.printAdress();
        // Affichage Info



    }

}
