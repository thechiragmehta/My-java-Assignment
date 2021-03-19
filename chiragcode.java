//Name:Chirag Mehta
//Student ID: 201905906
//Date Submitted: March 19 2021
//Class IN2203 Section Number : G1
//Name of work: Assignment 1: The gambling Game

import java.util.*;
import java.lang.Math;


public class MainApplicaton {
    public static void main(String[] args){
    Casino c= new Casino();
    c.OrganizeNewGame();
    }
}
class Casino{
    	Player p1= new Player();
   	 Game g1= new Game();
    	String userAnswer;
    	String userName;
        Scanner s= new Scanner(System.in);
        	public void OrganizeNewGame(){
            System.out.println("Welcome to the Casino: Would you like to play a game? (y/n)");
        userAnswer= s.nextLine();
        
        if(userAnswer.equals("y")){
            System.out.println("Enter your Name");
        userName= s.nextLine();
            System.out.println("let's get started " + userName);
                    g1.PlayGame();
                    p1.Winner();
}
else
{System.out.println("Good bye");}
}
}
class Game{
    Random rand= new Random();
    int ComputerGuess= rand.nextInt(100) ;
    
    public void PlayGame(){
        System.out.println("Guess a number from 1 to 100");
        System.out.println("If your guess is within 20 of my guess: then you win . Else i will WIN  ");
        ComputerGuess= ComputerGuess();
        
        
    }
     public int ComputerGuess(){
      int programGuess;
       programGuess = rand.nextInt(100);
      return programGuess;
     }
}
class Player extends Game{
   
    Game myobj= new Game();
    
    public void Winner()
    {
        Scanner sc= new Scanner(System.in);
        int rounds= 5;
        int playerNumber;
        
        for(int i=1; i<= rounds;i++)
        {
            System.out.println("Guess your number");
            playerNumber= sc.nextInt();
            
            if(Math.abs(playerNumber - myobj.ComputerGuess)< 20 )
            {System.out.println("Congratulations! You are the winner");
                System.out.println("My Number is " + myobj.ComputerGuess );
            break;}
            
            else 
            {
                System.out.println(" Try again ");
            }
            if(i==rounds)
            {
                System.out.println("Game Over, you are out of rounds");
                System.out.println("The number is"+ ComputerGuess);
            }
            
        }
        
        
    }
    
}
        

