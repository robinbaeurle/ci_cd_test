import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class abcTest {

    private static Abc myAbc;

    @BeforeAll
    static void makeAbc(){
        myAbc = new Abc();
    }

    @Test
    void testMyAbc() {
        Assertions.assertEquals("abcdefghijklmnopqrstuvwxyz",myAbc.makeAbc());
        myAbc.setSomeText("Mein Text");
        Assertions.assertEquals("Mein Text", myAbc.getSomeText());
    }
}