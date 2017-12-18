import java.util.ArrayList;

public class CharHealer extends Character{

    private int strength = 1;
    private int speed = 5;
    private int health = 5;
    private int money = 100;
    ArrayList<Items>itemArray;

    public CharHealer(String name) {
        super(name);

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

