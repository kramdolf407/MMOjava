import java.util.ArrayList;

public class CharWarrior extends Character {

    private int strength = 10;
    private int speed = 5;
    private int health = 10;
    private int money = 100;
    ArrayList<Items> itemArray;

    public CharWarrior(String name, int money, int strength, int speed, int health, ArrayList<Items> itemArray) {
        super(name, money, strength, speed, health, itemArray);
    }


    public void weaponAttack(int enemyID){

        // reduce health for enemy

    }
    public void absorbDamage(int damage){

        int currentHealth = this.getHealth();
        int newHealth = currentHealth - damage;
        this.setHealth(newHealth);
    }

}

