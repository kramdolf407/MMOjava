public class Sale {

    private String itemName;
    private int cost;
    private String seller;

    public Sale(String itemName, int cost, String seller) {
        this.itemName = itemName;
        this.cost = cost;
        this.seller = seller;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }
}
