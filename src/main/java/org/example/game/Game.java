package org.example.game;
import org.example.board.Board;
import org.example.player.Player;
import java.util.Scanner;

public class Game {
    private Board b=new Board();
    private Player p1=new Player();
    private Player p2=new Player();
    private int count =0;
    Scanner cin =new Scanner(System.in);


    public void readPlayerData(){
        System.out.println("Enter P1 Name : ");
        String n =cin.next();
        p1.setName(n);

        System.out.println("Enter P1 Op : ");
        char op =cin.next().charAt(0);
        p1.setOperator(op);

        System.out.println("Enter P2 Name : ");
        n =cin.next();
        p2.setName(n);

        if(p1.getOperator()=='x')
            p2.setOperator('o');
        else
            p2.setOperator('x');

        System.out.println("P2 Operator is : "+p2.getOperator());
    }
    public void play(){
        Scanner cin = new Scanner(System.in);
        readPlayerData();
        b.draw();

        while(!b.isFull()){
            Player currentPlayer = p1;
            if(count%2==1) currentPlayer = p2;

            while(true){
                int pos;
                System.out.println("Select Empty Posittion from 1 to 9 :");
                pos=cin.nextInt();
                if(b.replaceChar(pos,currentPlayer)){
                    break;
                }
            }

            b.draw();
            if(b.isWin(currentPlayer)){
                System.out.println("The winner is : " + currentPlayer.getName());
                break;
            }
            count++;
        }

        if(b.isFull()){
            System.out.println("Game is Draw ..");
        }
    }
}

