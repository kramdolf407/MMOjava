import java.util.ArrayList;

public class Character {
    private int id;
    private String name;
    private int money;
    private ArrayList itemArray;
    private int strength;
    private int speed;
    private int health;

    public Character(int id, String name, int money, ArrayList itemArray, int strength, int speed, int health){
        this.id = id;
        this.name = name;
        this.money = money;
        this.itemArray = itemArray;
        this.strength = strength;
        this.speed = speed;
        this.health = health;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList getItemArray() {
        return itemArray;
    }

    public void setItemArray(ArrayList itemArray) {
        this.itemArray = itemArray;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
