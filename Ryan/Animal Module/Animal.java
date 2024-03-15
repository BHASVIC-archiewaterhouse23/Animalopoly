public class Animal {
    private String name;
    private double cost;
    private int level;
    public Animal(String name, double cost, int level) {
        this.name = name;
        this.cost = cost;
        this.level = level;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void upgrade() {
        level++;
    }
}
