import java.util.ArrayList;

public class CharMage extends Character {

    //WhiteMagic;
    //BlackMagic;
    //AbsorbDamage;

    public CharMage(int WhiteMagic, int BlackMagic, int AbsorbDamage, int id, String name, int money, ArrayList itemArray, int strength, int speed, int health) {
        super(id, name, money, itemArray, strength, speed, health);
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