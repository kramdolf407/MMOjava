import java.util.ArrayList;

public class Market extends Position {

    private ArrayList<Sale> sales;

    public Market(int x, int y) {
        super(x, y);
        this.sales = new ArrayList<>();
    }

    public ArrayList<Sale> getSales() {
        return sales;
    }

    public void setSales(ArrayList<Sale> sales) {
        this.sales = sales;
    }
}
