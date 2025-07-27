import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand =new Random();
        int numberToGuess=rand.nextInt(100)+1;
        int numberOfTries=0;
        int guess;
        boolean win =false;
        System.out.println("welcom to the number guessing Game!");
        System.out.println("Guess a number between 1 and 100 :");
       
        while (!win){
            guess = sc.nextInt();
            numberOfTries++;

            if (guess == numberToGuess){
                win=true;
            }else if (guess< numberToGuess){
                System.out.println("Too low , try again!");
            }else{
                System.out.println("Too high, try again!");
            }
        }
        System.out.println("congratulations ! you guessed the number in" + numberOfTries  + "tries.");
        sc.close();

    }
    
}
