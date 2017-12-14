public class EnemyArcher extends Enemy{

    private int speed;
    private int strength;

    public EnemyArcher(int health, int range, int damage, int speed, int strength) {
        super(health, range, damage);
        this.speed = speed;
        this.strength = strength;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void attack(){

        // attack method
    }

}
