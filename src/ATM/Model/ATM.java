package ATM.Model;

public class ATM {
    private int[] Bills = new int[3];
    static int money;

    public void setMoney() {
        money = Bills[0]*1000+Bills[1]*500+Bills[2]*100;
    }
    public int[] getMoney() {
        setMoney();
        return new int[]{money, Bills[0], Bills[1], Bills[2]};
    }
}