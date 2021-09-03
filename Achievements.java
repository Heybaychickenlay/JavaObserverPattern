/*
* Author: Josiah Guzman
* Just a simple observer pattern with a pseudo physics engine that allows the audio and achievements systems to work with each other along with the physics engine
* Date Made: 3/31/2021
*/
package ObserverPattern;

public class Achievements implements IObserver {
    Physics subject = new Physics();
    boolean achievedFallOffBridge = false;
    boolean achievedHitHeadWithPan = false;
    boolean achievedDidABackflip = false;

    public Achievements(Physics subject){
        this.subject = subject;
    }
    
    public void AchievedFallOffBridge(){
        if(!this.achievedFallOffBridge){
            this.achievedFallOffBridge = true;
            System.out.println("You unlocked the \"Fall of the bridge\" achievement!");
        }
    }
    public void AchievedHitHeadWithPan(){
        if(!this.achievedHitHeadWithPan){
            this.achievedHitHeadWithPan = true;
            System.out.println("You unlocked the \"Hit head with a pan\" achievement!");
        }
    }
    public void AchievedDidABackflip(){
        if(!this.achievedDidABackflip){
            this.achievedDidABackflip = true;
            System.out.println("You unlocked the \"Did a backflip\" achievement!");
        }
    }
    
    // Seperate from the achievements class itself
    @Override
    public void Update(){
        if(subject.fallingOffBridge){
            AchievedFallOffBridge();
        }
        else if(subject.hittingHeadWithPan){
            AchievedHitHeadWithPan();
        }
        else if(subject.doingABackflip){
            AchievedDidABackflip();
        }
    }
}
