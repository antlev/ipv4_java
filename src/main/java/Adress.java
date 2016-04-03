import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by antoine on 02/04/16.
 */
public abstract class Adress {

    protected ArrayList<Bite> bites ;

    // Constructor
    public Adress(){
        bites = new ArrayList<Bite>() ;
    }
    /**
     *
     * @param bites
     * @return true if adress has been set, else false
     */
    public boolean setAdress(ArrayList<Bite> bites){
        // We checks that the bites are valid
        try{
            for(int i=0;i<bites.size();++i){
                if(!bites.get(i).isValid()){
                    return false;
                }
            }
        } catch (Exception e){
            System.out.println("Array<Bite> invalid");
            return false ;
        }
        this.bites = bites ;
        return true;
    }

    private Bite getBite(short biteNum){
        return this.bites.get(biteNum);
    }

    private Bite setBite(short biteNum,Bite biteToSet){
        return this.bites.set(biteNum,biteToSet);
    }

    protected boolean isValid(){
        int biteValid = 0 ;
        try {
            for(int i=0;i<bites.size();++i){
                if(!this.bites.get(i).isValid()){
                    return false;
                } else{
                    biteValid++;
                }
            }
        } catch(Exception e){
            return false;
        }
        if(biteValid == 4 ){
            return true ;
        }
        return false;
    }

//    public Adress nextAdress(){
//        return Adress;
//    }
//    public Adress previousAdress(){
//        return Adress;
//    }

    public void printAdress(){
        System.out.println(bites.get(0).getDecValue()+"."+bites.get(1).getDecValue()+"."+bites.get(2).getDecValue()+"."+bites.get(3).getDecValue());
    }
    public void saveAdress(){
//        try{
//            File file = new File("data_ipv4");
//
//            FileWriter fileWriter = new FileWriter()
//        } catch (IOException e){
//            System.out.println("Ther has been an error while writing into file" + e.getStackTrace() + e.getMessage());
//        }
        // TODO
    }

    public void promptAdress(){
        // TODO
    }



}
