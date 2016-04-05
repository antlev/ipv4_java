/**
 * Created by antoine on 02/04/16.
 */
public class Network {

    private IpAdress networkAdress;
    private IpAdress broadcastAdress;
    private IpAdress firstAvailableAdress;
    private IpAdress lastAvailableAdress;
    private Mask mask ;
    private int nbAdressAvailable;

    public Network(){
        networkAdress = new IpAdress();
        broadcastAdress = new IpAdress();
        firstAvailableAdress = new IpAdress();
        lastAvailableAdress = new IpAdress();
        mask = new Mask();
    }

    public void setNetwork(IpAdress adress, Mask mask){
        nbAdressAvailable = (int) Math.pow(2,32-(mask.getCidr()));
    }

    private void calcNbAdress(){
        nbAdressAvailable = (int) Math.pow(2,32-(mask.getCidr()));
    }

    private void nextNetwork(){

    }
    private void previousNetwork(){

    }


}
