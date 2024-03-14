import java.util.concurrent.ThreadLocalRandom;
public class Dice {

    private int sides;
    public Dice(int sides){
        this.sides = sides;
    }
    public boolean isDouble(int num1, int num2){
        if(num1 == num2){
            return true;
        }
        else{
            return false;
        }
    }
    public int roll(){

        int random = ThreadLocalRandom.current().nextInt(1, this.sides+1);
        return random;
    }
}
