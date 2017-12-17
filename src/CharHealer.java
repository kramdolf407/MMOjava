import java.util.ArrayList;

public class CharHealer extends Character{

    public CharHealer(int HealFriends, int HealSelf, int id, String name, int money, ArrayList itemArray, int strength, int speed, int health) {
        super(id, name, money, itemArray, strength, speed, health);

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

