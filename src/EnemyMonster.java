public class EnemyMonster extends Enemy{

    boolean boss = true;

    public EnemyMonster(int health, int range, int damage, int x, int y) {
        super(health, range, damage, x, y);

    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }
}
