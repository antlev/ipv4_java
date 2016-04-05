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

    public Adress(ArrayList<Bite> bites) throws Exception {
        // We checks that the bites are valid
        this.bites = new ArrayList<Bite>() ;
        try{
            for(int i=0;i<bites.size();++i){
                if(!bites.get(i).isValid()){
                    throw new cantCreateAdressException();
                }
            }
        } catch (Exception e){
            System.out.println("Array<Bite> invalid");
            throw new cantCreateAdressException();
        }
        for(int i=0;i<4;++i){
            this.bites.add(i,new Bite(bites.get(i).getDecValue()));
        }
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
        for(int i=0;i<4;++i){
            this.bites.get(i).setBite(bites.get(i).getDecValue());
        }
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

    public IpAdress nextAdress() throws Exception {
        IpAdress nextAdress ;
        for(int i=0;i<bites.size();++i){
            if(bites.get(i).increment() == false){
                nextAdress = new IpAdress(bites);
                return nextAdress;
            }else if(i == 4){
                throw new invalidAdressException();
            }
        }
        throw new Exception();
    }
//    public Adress previousAdress(){
//        return new Adress();
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


    public class invalidAdressException extends Exception{

        public invalidAdressException(){
            super();
        }
    }

    public class cantCreateAdressException extends Exception{

        public cantCreateAdressException(){
            super();
        }
    }

}
