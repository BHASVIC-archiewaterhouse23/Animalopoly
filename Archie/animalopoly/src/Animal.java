public class Animal {
    protected String name;
    protected int cost;
    protected Player owner;
    int level;

    public Animal(String name, int cost, int level){
        this.name = name;
        this.cost = cost;
        this.level = level;
    }
    public void owner(Player owner){
        this.owner = owner;
    }
    
}
