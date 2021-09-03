/*
* Author: Josiah Guzman
* Just a simple command pattern that has a receiver and supports undoable actions.
* Date Made: 3/31/2021
*/
package ObserverPattern;

public class Audio implements IObserver{
    Physics subject = new Physics();
    
    public Audio(Physics subject){
        this.subject = subject;
    }
    
    public void PlayFallSoundEffect(){
        System.out.println("Splat");
    }
    
    public void PlayPanSoundEffect(){
        System.out.println("Klonk");
    }
    
    public void PlayBackflipSoundEffect(){
        System.out.println("Whoosh");
    }
    
    
    // Seperate from the audio class itself
    @Override
    public void Update(){
        if(subject.fallingOffBridge){
            PlayFallSoundEffect();
        }
        else if(subject.hittingHeadWithPan){
            PlayPanSoundEffect();
        }
        else if(subject.doingABackflip){
            PlayBackflipSoundEffect();
        }
    }
}
