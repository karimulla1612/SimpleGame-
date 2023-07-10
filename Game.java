import java.util.Random;
import java.util.Scanner;
 class Game{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String play = "yes";
        while(play.equals("yes")){
            Random rand  = new Random();
            int RandomNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;
            while(guess!= RandomNum){
            System.out.println("Enter Any Random Number: ");
            guess = input.nextInt();
            tries++;
            if(guess==RandomNum){
                  System.out.println("Fentastic You won the game: ");
                  System.out.println("WOW......it  took  You  only to "+ tries +"Guess :" );
                  System.out.println("Would You like to Play again!? say yes or no: ");
                  play = input.next().toLowerCase();
            }
            else if(guess > RandomNum){
                System.out.println(" Too Heigh Try again: ");
            }
            else{
                 System.out.println(" Too Low Try again: ");
            }
            }
            }
            input.close();
        }
        
    }