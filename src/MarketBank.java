import java.util.ArrayList;

public class MarketBank extends Market {

    private int money = 1000;

    public MarketBank(ArrayList itemsArray, int money, int x, int y){
        super(x,y);
        this.money = money;
    }
}


    private ArrayList<Items> itemsArray;