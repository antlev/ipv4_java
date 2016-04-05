import java.util.ArrayList;

/**
 * Created by antoine on 02/04/16.
 */
public class Mask extends Adress {

    private short cidr;

    private void setCidr(ArrayList<Bite> bites){
        this.cidr = 0 ;
        for(int i=0;i<bites.size();++i){
            for(int j=0;j<bites.get(i).getBits().size();++j){

                if(bites.get(i).getBits().get(j).getBitValue() == 1){
                    this.cidr++; // If the bit has a value of 1 we increment the cidr variable
                } else {
                    return; // else the cidr is now correct
                }
            }
        }
    }

    public boolean setMaskUsingCidr(short cidr){
        short valToset = 1 ;
        try{
            for(int i=0;i<4;++i){
                for(int j=0;j<8;++j){
//                    bites.set(i,new Bite());
                    bites.get(i).getBits().set(j,new Bit(valToset,(short)j));
                    cidr--;
                    if(cidr == 0) {
                        valToset = 0;
                    }
                }
            }
        } catch (Exception e){
            return false;
        }
        return true ;
    }

    public short getCidr(){
        return cidr;
    }


    public boolean isMaskValid(){
        return false;
    }
}
