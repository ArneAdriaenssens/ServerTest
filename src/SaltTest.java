
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Arne on 25/02/2016.
 */
public class SaltTest {

    private Salt testObject;

    @Before
    public void setUp(){
        testObject=new Salt();
    }

    @Test
    public void test_generateSalt(){
        testObject.generateSalt();
        assertTrue(true);
    }

    @Test
    public void test_compareSalt(){
        testObject.compareSalt(testObject.generateSalt());
        assertTrue(true);
    }

}
