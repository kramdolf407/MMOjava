import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharTest {

    @Test
    public static void CharTest(String[] args) {
        CharHealer myhealer = new CharHealer("FAd", 1,1);
        myhealer.setSpeed(2000);
        //System.out.println(myhealer.getSpeed());


        assertEquals(myhealer.getSpeed(),2000);

    }
}
