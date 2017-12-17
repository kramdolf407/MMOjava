import java.util.ArrayList;

public class CharWarrior extends Character {


    public CharWarrior(String name, int money, ArrayList itemArray, int strength, int speed, int health) {
        super(name, money, itemArray, strength, speed, health);

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

