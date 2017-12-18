import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void testAccountAndLogin(){
        Account account;
        account = new Account("email@email.com","mypassword");

        boolean resultFromLogin = account.tryLogin("email@email.com","mypassword");
        assertEquals(resultFromLogin,true);
    }

}
