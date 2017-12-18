import java.util.ArrayList;

public class CharMage extends Character {

    private int money = 100;
    private int strength = 3;
    private int speed = 5;
    private int health = 5;
    ArrayList<Items>itemArray;

    public CharMage(String name) {
        super(name);
    }

    public void whiteMagic(int friendID){

        // heal friend
    }

    public void blackMagic(int enemyID){

        // damage to enemy
    }

    public void absorbDamage(int damage){

        int currentHealth = this.getHealth();
        int newHealth = currentHealth - damage;
        this.setHealth(newHealth);
    }
}