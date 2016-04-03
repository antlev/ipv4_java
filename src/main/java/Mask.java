import java.util.ArrayList;

/**
 * Created by antoine on 02/04/16.
 */
public class Mask extends Adress {

    private short cidr;

    public Mask(ArrayList<Bite> bites){
        super(bites);
        setCidr(bites);
    }
//    public Mask(short cidr){
//        this.cidr = cidr ;
//
//    }

    private void setCidr(ArrayList<Bite> bites){
        this.cidr = 0 ;
        for(int i=0;i<bites.size();++i){
            for(int j=0;j<bites.get(i).getBite().size();++j){

                if(bites.get(i).getBite().get(j).getBitValue() == 1){
                    this.cidr++; // If the bit has a value of 1 we increment the cidr variable
                } else {
                    return; // else the cidr is now correct
                }
            }
        }
    }

    private void setMaskUsingCidr(short cidr){
        while(cidr > 0){
            for(int i=0;i<bites.size();++i){
                for(int j=0;j<bites.get(i).getBite().size();++j){
                    cidr--;
                }
            }

        }
    }

    public short getCidr(){
        return cidr;
    }


    public boolean isMaskValid(){
        return false;
    }
}
