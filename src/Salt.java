import java.security.SecureRandom;

/**
 * Created by Arne on 25/02/2016.
 */
public class Salt {

    private byte[] salt;

    public Salt(){
        this.salt=this.generateSalt();
    }

    public boolean compareSalt(byte[] compare){
        return this.salt.equals(compare);
    }

    public byte[] generateSalt(){
        return new SecureRandom().generateSeed(20);
    }

}
