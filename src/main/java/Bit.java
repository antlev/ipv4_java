/**
 * Created by antoine on 02/04/16.
 */
public class Bit {

    private short bit ;
    private short weight;

    public Bit(short val,short weight){
        this.bit = val ;
        this.weight = weight;
    }

    public short getBitValue() {
        return bit;
    }

    public void setBit(short bit,short weight) {
        this.bit = bit;
        this.weight = weight ;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }
}
