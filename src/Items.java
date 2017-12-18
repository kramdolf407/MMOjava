public class Items {

    private final int id;
    private String name;
    private int cost;
    private Boolean equipable;
    private static int nextID = 1;

    public Items(int id, String name, int cost, Boolean equipable) {
        this.id = nextID++;
        this.name = name;
        this.cost = cost;
        this.equipable = equipable;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Boolean getEquipable() {
        return equipable;
    }

    public void setEquipable(Boolean equipable) {
        this.equipable = equipable;
    }
}