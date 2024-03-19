import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner (System.in);
        Card[] deck = new Card[20];
        for (int i = 0; i<=19; i++){
            deck[i] = new Card(i,20);
        }
        int position = 0;
        for (int i = 0; i<=19; i++){
            deck[i] = new Card(i,20);
        }
        int end = 0;
        String win = null;

        Dice dice1 = new Dice(6);
        Dice dice2 = new Dice(6);
        System.out.println("welcome to brainrot monopoly");
        System.out.println("How many will be playing.");
        int numPlayers = Integer.valueOf(reader.nextLine());
        MonopolyBoard board = new MonopolyBoard(numPlayers);
        Player[] player = new Player[numPlayers];
        Animal[] animal = new Animal[27];
        for (int i = 1;i<26;i++){
            if (i==13){
                i++;
            }
            animal[i] = new Animal(board.getBOARD(i),15*i+75,i);
        }
        for (int i = 0;i<numPlayers;i++) {
            System.out.println("Please enter name and playing piece");

            String name = reader.next();
            char piece = reader.next().charAt(0);
            player[i] = new Player(name, piece);
            System.out.println("Your name is:" + player[i].getName() + " Your playing piece is: " + player[i].getPlayingPiece());
        }
        while (true) {
            for (int i = 0; i < numPlayers; i++) {
                if(player[i].getMoney()<0){
                    System.out.println(player[i].getName()+" has Lost");
                    end = 0;
                    for (int k = 0; k<numPlayers;k++) {
                        if (player[k].getMoney()<0){
                            end = end+1;
                        }
                        else{
                            win = player[k].getName();
                        }
                        if (end >= (numPlayers - 1)){
                            System.out.println(win+" has won!");
                            System.exit(0);
                        }
                    }

                }
                else {
                    System.out.println("It is " + player[i].getName() + "'s turn");
                    if (player[i].getPosition() == 13) {
                        System.out.println("miss a turn!");
                        player[i].movePlayer(1);

                    } else {
                        if (player[i].money > 0) {
                            int roll1 = dice1.roll();
                            int roll2 = dice2.roll();
                            System.out.println("You have rolled a " + roll1 + " and a " + roll2);
                            int roll = roll1 + roll2;
                            if (dice1.isDouble(roll1, roll2) == true) {
                                roll = roll * 2;
                            }
                            position = player[i].movePlayer(roll);
                            if (position == 13) {
                                System.out.println("You have landed on MISS A GO");
                            } else if (position == 0) {
                                System.out.println("You are now at tile " + position);
                            } else {
                                System.out.println("You are now at tile " + position);
                                System.out.println("Animal info:");
                                System.out.println("name = " + animal[position].getName());
                                System.out.println("cost = " + animal[position].getCost());

                                if (animal[position].getOwner() != null) {
                                    System.out.println("owner = " + animal[position].getOwner());
                                    if(animal[position].getOwner()==player[i].getName()){
                                        System.out.println("Would you like to upgrade for 100 ROBUX");
                                        char buy = reader.next().charAt(0);
                                        if (buy == 'y') {
                                            animal[position].Upgrade(player[i].getMoney());
                                        }
                                    }
                                    else {
                                        animal[position].tax(player[i]);
                                        System.out.println("You just got fanum taxed " + animal[position].getTaxPrice() + " ROBUX");
                                        System.out.println("Your balance is " + player[i].getMoney() + " ROBUX");
                                    }
                                } else {
                                    System.out.println("Your balance is " + player[i].getMoney());
                                    System.out.println("Would you like to purchase this animal y/n");
                                    char buy = reader.next().charAt(0);
                                    if (buy == 'y') {
                                        if (player[i].getMoney() < animal[position].getCost()) {
                                            System.out.println("You don't have enough money!");
                                        } else {
                                            player[i].removeMoney(animal[position].getCost());
                                            animal[position].owner(player[i]);
                                            System.out.println("Your balance is " + player[i].getMoney()+" ROBUX");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }




    }
}