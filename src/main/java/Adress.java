import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by antoine on 02/04/16.
 */
public abstract class Adress {

    private ArrayList<Bite> bites ;

    // Constructor
    public Adress(){

    }

    private Bite getBite(short biteNum){
        return this.bites.get(biteNum);
    }

    public void saveAdress(){

    }

    public void promptAdress(){

    }



}
