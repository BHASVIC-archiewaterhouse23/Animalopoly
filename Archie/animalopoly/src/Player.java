public class Player {
    protected String name;
    protected char playingPiece;
    protected int money;
    protected int position;
    protected int id;
    public Player(String name, char playingPiece){
        this.name = name;
        this.playingPiece = playingPiece;
        this.money = 1000;
        this.id = id;
        this.position = 0;
    }
    public boolean missATurn(){
        return false;
    }
    public void buy(Animal bought){
        if(bought.cost>this.money){
            System.out.println("You don't have enough ROBUX!");
        }
        else{
            this.money = this.money-bought.cost;
        }
    }
    public int getMoney(){
        return this.money;
    }
    public void addMoney(int add){
        this.money = this.money + add;
    }
    public void removeMoney(int remove){
        this.money = this.money - remove;
    }

    public String getName(){
        return this.name;
    }

    public char getPlayingPiece(){
        return this.playingPiece;
    }

    public int getPosition(){
        return this.position;
    }

    public int movePlayer(int steps){
        int total = this.position+steps;
        if (total>25){
            this.position = total - 26;
            if (this.position == 0){
                System.out.println("You landed on GO! Here is 1000 ROBUX");
                this.money = this.money + 1000;
            }
            else{
                System.out.println("You passed GO here is 500 ROBUX");
                this.money = this.money + 500;
            }
        }
        else {
            this.position = total;
        }
        return this.position;
    }
    public void changePosition(int newPosition){
        this.position = newPosition;
    }


}
