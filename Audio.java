/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

/**
 *
 * @author Josiah Guzman
 */
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
