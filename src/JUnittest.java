import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnittest {
    @Test
    public static void main(String[] args) {
        CharHealer myHealer = new CharHealer("New Char", 1, 2);
        myHealer.setName("PlayerRenamed");
        Character myCharModified = (Character) myHealer;
        System.out.println(myCharModified.getName());
    }
    @Test
    private void TestUserLogin() {
        Account testAcc = new Account("email@email.com", "mypassword");
        boolean resultFromLogin = testAcc.tryLogin("email@email.com", "mypassword");
        assertEquals(resultFromLogin, true);
    }
}