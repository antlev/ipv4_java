import java.util.ArrayList;

/**
 * Created by antoine on 02/04/16.
 */
public class Bite {

    private ArrayList<Bit> bite;
    private int decValue ;


    public Bite(ArrayList<Bit> bite){
        this.bite = bite;
        setDecValue(bite);
    }

    public Bite(int decValue){
        this.bite = new ArrayList<Bit>();
        this.decValue = decValue;
    }

    public boolean isValid(){
        if(decValue >= 0 && decValue <= 255){
            return true;
        } else {
            return false;
        }
    }

    public void printBite(){
        System.out.print(decValue);
    }


    public int getDecValue(){
        return decValue;
    }
    public ArrayList<Bit> getBite(){
        return bite;
    }

    /**
     * Return 0 if all bits are 0, Return 1 if all bits are 1,
     * Return 2 if bits are 0 and 1 but contiguous, else Return -1
     * @return
     */
    public short areBitsContiguous(){
        short lastVal = bite.get(0).getBitValue();
        short change = 0 ; // Is incremented if 2 consecutive bits are different

        short nbZero = 0,nbOne = 0;

        for(int i=0;i<bite.size();++i){
            if(bite.get(i).getBitValue() == 0){
                if(lastVal != bite.get(i).getBitValue()){
                    change++;
                    lastVal = bite.get(i).getBitValue();
                }
                nbZero++;
            } else if(bite.get(i).getBitValue() == 1){
                if(lastVal != bite.get(i).getBitValue()){
                    change++;
                    lastVal = bite.get(i).getBitValue();
                }
                nbOne++;
            }
        } if(nbZero == 8){
            return 0;
        } else if(nbOne == 8){
            return 1;
        } else if (change == 1){
            return 2 ;
        } else {
            return -1;
        }
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
