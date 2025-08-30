import java.util.Random;
import java.util.Scanner;

public class Guessnumber {
    public static void main(String[] args) {
        Random random =new Random();
        Scanner scanner = new Scanner(System.in);
        int randomnumber=random.nextInt(100)+1;
        int guess=0;
         while (randomnumber != guess) { 
            System.out.println("Guess a number between 1 to 100");
            if(scanner.hasNextInt()){
                guess=scanner.nextInt();
                System.out.println("You Guessed:"+guess);
                if(guess>randomnumber){
                System.out.println("You Guessed Higher Number");
            }
            else if(guess<randomnumber){
                System.out.println("You Guessed Smaller Number ");
            }
            else{
                System.out.println("Congratulations! You Guessed The Correct Number");
            }
        }
    }
}
}
