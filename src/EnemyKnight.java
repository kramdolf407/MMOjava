public class EnemyKnight extends Enemy{

    private int armor;
    private int strength;

    public EnemyKnight(int health, int range, int damage, int armor, int strength ,int x, int y) {
        super(health, range, damage, x, y);
        this.armor = armor;
        this.strength = strength;

    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void attack(){

        // attack
    }
}
