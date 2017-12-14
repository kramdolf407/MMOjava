public class EnemyMonster extends Enemy{

    boolean boss = true;

    public EnemyMonster(int health, int range, int damage) {
        super(health, range, damage);

    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }
}
