import java.util.ArrayList;

public class Account {

    private ArrayList<Character> characters;
    private ArrayList<String> friends;
    private String email;
    private String password;
    private int id;


    public Account(ArrayList<Character> characters, ArrayList<String> friends, String email, String password, int id) {
        this.characters = characters;
        this.friends = friends;
        this.email = email;
        this.password = password;
        this.id = id;

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

    public void setId(int id) {
        this.id = id;
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
