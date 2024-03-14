public class Card {
    protected int amount;
    protected String Scenario;
    protected int price;
    public Card(int num, int price) {
        this.amount = num;
        this.price = price;
    }

    public int test(){
        return this.amount;
    }

    public int getPrice(){
        return this.price;
    }
}
