import java.util.ArrayList;

public class MarketBank extends Market implements AccountAdminToMarketBank {

    private int money = 1000;

    public MarketBank(ArrayList<Sale> itemsArray, int x, int y) {
        super(x, y);
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public void placeMoney(int money) {
        int currentMoney = this.getMoney();
        int newMoney = currentMoney + money;
        this.setMoney(newMoney);
    }

    @Override
    public void takeMoney(int money) {
        this.setMoney(this.getMoney()-money);
    }
}