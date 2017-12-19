import java.util.ArrayList;


public class AccountAdmin extends Account {
    public AccountAdminToMarketBank checkmarket;

    public AccountAdmin(ArrayList<Character> characters, ArrayList<AccountFriends> friends, String email, String password, AccountAdminToMarketBank checkmarket) {
        super(characters, friends, email, password);
        this.checkmarket = checkmarket;
    }
}

///