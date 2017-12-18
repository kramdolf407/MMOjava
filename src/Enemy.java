public class Enemy extends Position{

    private final int id;
    private int health;
    private int range;
    private int damage;
    private  static int nextID = 1;

    public Enemy(int health, int range, int damage, int x, int y) {
        super(x, y);
        this.health = health;
        this.range = range;
        this.damage = damage;
        this.id = nextID;
        Enemy.nextID ++;
    }

    public int getId() {
        return id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
