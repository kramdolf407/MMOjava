import java.util.ArrayList;

public class Account {

    private final int id;
    private ArrayList<Character> characters;
    private ArrayList<String> friends;
    private String email;
    private String password;
    private boolean online;
    private static int nextID = 1;

    public Account(ArrayList<Character> characters, ArrayList<String> friends, String email, String password) {
        this.characters = characters;
        this.friends = friends;
        this.email = email;
        this.password = password;
        this.online = false;
        this.id = nextID;
        Account.nextID ++;

    }

    public boolean tryLogin(String email, String password) {
        if(this.email.equals(email) && this.password.equals(password) && !this.online){
            return true;
        }
        else{
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    public ArrayList<String> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<String> friends) {
        this.friends = friends;
    }
}
