import java.util.ArrayList;

/**
 * Created by antoine on 02/04/16.
 */
public class Bite {

    private ArrayList<Bit> bite;
    private int decValue ;


    public Bite(ArrayList<Bit> bite){
        setDecValue(bite);
    }

    public Bite(int decValue){
        setBite(decValue);
    }

    public boolean isValid(){
        if(decValue >= 0 && decValue <= 255){
            return true;
        } else {
            return false;
        }
    }

    public int getDecValue(){
        return decValue;
    }
    public ArrayList<Bit> getBite(){
        return bite;
    }

    public boolean areBitsContigous(){
        short bitVal = bite.get(0).getBitValue();
        for(int i=1;i<bite.size();++i){
            if(true){
                //TODO
            }
        }
        return true;
    }


    private void setDecValue(ArrayList<Bit> bite){
        decValue = 0 ;
        for (Bit bit:bite) {
            decValue += bit.getBitValue()*(Math.pow(2,bit.getWeight()));
        }
    }

    private void setBite(int decValue){
        for (int i=0;i<bite.size();++i){
            if(decValue >= Math.pow(2,(7-i))){
                bite.set(7-i,new Bit((short) 1,(short) (7-i)));
            } else {
                bite.set(7-i,new Bit((short) 0, (short) (7-i)));
            }
        }

    }
}
