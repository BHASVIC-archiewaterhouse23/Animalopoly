public class Animal {
    protected String name;
    protected int cost;
    protected Player owner;
    protected int level;
    protected int taxPrice;

    public Animal(String name, int cost, int level) {
        this.name = name;
        this.cost = cost;
        this.level = level;
        this.owner = null;
        this.taxPrice = cost * 1 / 2;
    }

    public void owner(Player owner) {
        this.owner = owner;
    }

    public String getOwner() {
        if (owner != null) {
            return owner.name;
        }
        return null;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return this.cost;
    }

    public String getName() {
        return this.name;
    }

    public void tax(Player target) {
        target.removeMoney(this.taxPrice);
        this.owner.addMoney(this.taxPrice);
    }

    public int getTaxPrice() {
        return this.taxPrice;
    }

    public String Upgrade(int money) {
        int price = 100;
        if (money >= price) {
            this.owner.money += price; // payment will be the global for the users wallet
            owner.money = owner.money - price;
            this.taxPrice = this.taxPrice * 2;
            return "you have ugraded an animal to max level";

        } else {
            return "you do not have the funds";
        }

    }
}
