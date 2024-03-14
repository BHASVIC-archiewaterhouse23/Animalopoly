public class Player {
    protected String name;
    protected char playingPiece;
    protected int money;
    protected int id;
    public Player(String name, char playingPiece,int id){
        this.name = name;
        this.playingPiece = playingPiece;
        this.money = 500;
        this.id = id;
    }
    public boolean missATurn(){
        return false;
    }
    public void buy(Animal bought){
        if(bought.cost>this.money){
            System.out.println("You don't have enough money!");
        }
        else{
            this.money = this.money-bought.cost;
        }
    }
    public int getMoney(){
        return this.money;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

}
