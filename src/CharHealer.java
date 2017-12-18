import java.util.ArrayList;

public class CharHealer extends Character{

    public CharHealer(String name, int x, int y) {
        super(name, 100, 1, 4, 5, x, y);
    }

    public CharHealer(String name, ArrayList<Items> itemArray, int x, int y) {

        super(name, 100, 1, 4, 5, itemArray, x, y);
    }

    public void healFriend(int friendID){

        // increase health for friend
    }

    public void healSelf(int healAmount){

        int currentHealth = this.getHealth();
        int newHealth = currentHealth + healAmount;
        this.setHealth(newHealth);
    }
}

