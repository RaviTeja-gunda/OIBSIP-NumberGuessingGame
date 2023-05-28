
/***************************************NUMBER GUESSING GAME******************************************/

import java.util.*;
public class Numberguessing {
    public static void main(String kj[]){
        Scanner s=new Scanner(System.in);
        Random rand=new Random();
        int ok=0;
        do{
            int randomNumber=rand.nextInt(100);
            int guess=0,c=0,score=0;
            boolean f=true;
            System.out.println();
            System.out.println();
            System.out.println("============================================================================");
            System.out.println();
            System.out.println("====================  WELCOME TO NUMBER GUESSING GAME ====================  ");
            System.out.println();
            System.out.print("Guess a number (1-100) within 8 chances: ");
            guess=s.nextInt();
            c++;
            while(guess!=randomNumber){
                if(c>=8){
                    System.out.println();
                    System.out.println("   -|------------------------------------------|-");
                    System.out.println("    |     Oops...!You Lost the game            |");
                    System.out.println("    |     Correct Answer is: "+randomNumber+"                |");
                    System.out.println("    |     Your Score is: 0                     |");
                    System.out.println("    |     Better Luck next time                |");
                    System.out.println("   -|------------------------------------------|-");
                    score=0;
                    System.out.println();
                    f=false;
                    break;
                }
                if(guess>randomNumber){
                    System.out.println("No! Your number is greater than original number");
                }else if(guess<randomNumber){
                    System.out.println("No! Your number is lesser than original number");
                }
                System.out.println();
                System.out.println("You have only "+(8-c)+" chances");
                System.out.print("Guess again: ");
                guess=s.nextInt();
                c++;
            }
            if(f){
                System.out.println();
                System.out.println("   -|------------------------------------------------|-");
                System.out.println("    |     Hurray...!You win                          |");
                System.out.println("    |     You guessed in "+c+" chances                   |");
                switch(c){
                    case 1:score=10;;break;
                    case 2:score=9;break;
                    case 3:score=8;break;
                    case 4:score=7;break;
                    case 5:score=6;break;
                    case 6:score=5;break;
                    case 7:score=4;break;
                    case 8:score=3;break;
                }
                System.out.println("    |     Your Score: "+score+"                              |");
                System.out.println("    |     Keep Playing and improve your accuracy     |");
                System.out.println("   -|------------------------------------------------|-");
                System.out.println();
            }
            System.out.print("Press 1 to take another game: ");
            ok=s.nextInt();
        }while(ok==1);
        System.out.println();
        System.out.println("========== THANKYOU ==========");
        s.close();
    }
}