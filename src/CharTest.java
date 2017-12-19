import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharTest {

    @Test
    public void CharTest() {
        CharHealer myhealer = new CharHealer("FAd", 1,1);
        myhealer.setSpeed(2000);
        //System.out.println(myhealer.getSpeed());
        myhealer.setStrength(1000);



        assertEquals(myhealer.getSpeed(),2000);
        assertEquals(myhealer.getStrength(),1000);
        System.out.println(myhealer.getSpeed());

    }
}
