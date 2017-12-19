import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnittest {
    @Test
    public void testCharHealer() {
        CharHealer myHealer = new CharHealer("New Char", 1, 2);
        myHealer.setName("PlayerRenamed");
        Character myCharModified = (Character) myHealer;
        System.out.println(myCharModified.getName());
        TestUserLogin();
    }
    @Test
    public void TestUserLogin() {
        Account testAcc = new Account("email@email.com", "mypassword");
        boolean resultFromLogin = testAcc.tryLogin("email@email.com", "mypassword");
        assertEquals(resultFromLogin, true, "something wrong");
        System.out.println("hello");
    }
}