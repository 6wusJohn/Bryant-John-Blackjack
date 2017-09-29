
/**
 * The card game Blackjack.
 * 
 * @author John Bryant
 * @version 9.25.17
 */
import java.util.Scanner;
import java.lang.Math;

public class Blackjacks{
    private int PH;
    private int DH;
    public static void deal(){
        int PH = (int)((Math.random() *21) +1); // player's hand
        int DH = (int)((Math.random() *10) +1); //Dealer's hand
        int rand1 = (int)((Math.random() *10) +1); 
        int rand2 = (int)((Math.random() *10) +1);
        System.out.println(" You have "+ PH +" The Dealer has "+ DH +" Hit? true or false");
        Scanner scanner = new Scanner(System.in);
        boolean ans = scanner.nextBoolean();
        //System.out.println(PH);
        //System.out.println(DH);
    
    if (ans == true){ //Hit
            PH = PH + rand1;
            System.out.println("You have "+ PH + " Hit or stay?");
            Scanner hit = new Scanner(System.in);
            boolean ans2 = hit.nextBoolean();
            if (ans2 == true) {
                PH = PH + rand2;
                System.out.println("You have "+ PH + " Hit or stay?");
                Scanner hit2 = new Scanner(System.in);
                boolean ans3 = hit2.nextBoolean();
            }
      } else if (ans == false){ // Stay
                PH = PH;
                if (PH > 21){
                System.out.println("You bust with"+ PH +" You Lost.");
            }else if (DH > 21){
                System.out.println("The Dealer has bust, you've won.");
                while (DH < 17){
            DH = DH + rand1;
        }
            if (PH < DH) {
            System.out.println("You've lost this hand!");
        
        } else if (PH > DH){
            System.out.println("You've won this hand.");
        
       }
      }
    }
  }
}