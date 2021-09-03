/*
* Author: Josiah Guzman
* Just a simple observer pattern with a pseudo physics engine that allows the audio and achievements systems to work with each other along with the physics engine
* Date Made: 3/31/2021
*/
package ObserverPattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        // Creating the objects used to simulate a game
        Physics stanley = new Physics();
        Audio stanleyAudio = new Audio(stanley);
        Achievements stanleyAchievements = new Achievements(stanley);
        
        stanley.AddObserver(stanleyAudio);
        stanley.AddObserver(stanleyAchievements);
        
        int userSelection = 0;
        
        while(userSelection != 4){
            System.out.println("\nEnter the corresponding number to one of the options below");
            System.out.println("1: Jump off the bridge");
            System.out.println("2: Hit your head with a pan");
            System.out.println("3: Do a backflip");
            System.out.println("4: Exit the program");
            userSelection = scan.nextInt();
            System.out.println();
            
            switch(userSelection){
                case 1: stanley.FallOffBridge();
                        break;
                case 2: stanley.HitHeadWithPan();
                        break;
                case 3: stanley.DoABackflip();
                        break;
                case 4: System.out.println("Thank you for using Josiah's observer pattern");
                        break;                        
                default: System.out.println("Error! The number you entered has no corresponding option");
                         break;
            }
            
        }
    }
}
