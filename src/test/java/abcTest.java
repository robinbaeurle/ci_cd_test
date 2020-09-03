//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

class abcTest {

    private static Abc myAbc;

    @Before
    public void makeAbc(){
        myAbc = new Abc();
    }

    @Test
    public void testMyAbc() {
        assertEquals("abcdefghijklmnopqrstuvwxyz",myAbc.makeAbc());
        myAbc.setSomeText("Mein Text");
        assertEquals("Mein Text", myAbc.getSomeText());
    }
}