import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        Card[] deck = new Card[20];
        Player[] player = new Player[5];
        for (int i = 0;i<4;i++) {
            System.out.println("Please enter name and playing piece");
            String name = reader.next();
            char piece = reader.next().charAt(0);
            player[i] = new Player(name, piece);
            System.out.println("Your name is:" + player[i].getName() + " Your playing piece is: " + player[i].getPlayingPiece());
        }
        Animal Jamal = new Animal("cow",30,1);
        Dice dice1 = new Dice(6);
        Dice dice2 = new Dice(6);
        for (int i = 0; i<=19; i++){
            deck[i] = new Card(i,20);
        }

        int i = 0;
        while (true){
            i = i+1;
            break;
        }


        System.out.println("input number to draw card");
        int value = Integer.valueOf(reader.nextLine());
        System.out.println(deck[value].test()); //test data
        System.out.println(dice1.roll()); //test data
    }
}