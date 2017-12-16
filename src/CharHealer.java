import java.util.ArrayList;

public class CharHealer extends Character{

    private int HealFriends;
    private int HealSelf;

    public CharHealer(int HealFriends, int HealSelf, int id, String name, int money, ArrayList itemArray, int strength, int speed, int health) {
        super(id, name, money, itemArray, strength, speed, health);
        this.HealFriends = HealFriends;
        this.HealSelf = HealSelf;
    }

    public int getHealFriends() {
        return HealFriends;
    }

    public void setHealFriends(int healFriends) {
        HealFriends = healFriends;
    }

    public int getHealSelf() {
        return HealSelf;
    }

    public void setHealSelf(int healSelf) {
        HealSelf = healSelf;
    }
}

