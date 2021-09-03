/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;
import java.util.ArrayList;
/**
 *
 * @author Josiah Guzman
 */
public class Physics implements ISubject{
    ArrayList<IObserver> observers = new ArrayList();
    
    boolean fallingOffBridge = false;
    boolean hittingHeadWithPan = false;
    boolean doingABackflip = false;
    
    public void Physics(){
        // May add some stuff later
    }
    
    // Just to simplify everything I just simulated that these events happened
    public void FallOffBridge(){
        this.fallingOffBridge = true;
        Notify();
    }
    
    public void HitHeadWithPan(){
        this.hittingHeadWithPan = true;
        Notify();
    }
    
    public void DoABackflip(){
        this.doingABackflip = true;
        Notify();
    }
    
    public void Reset(){
        this.fallingOffBridge = false;
        this.hittingHeadWithPan = false;
        this.doingABackflip = false;
    }
    
    
    // Seperate from the physics class itself
    @Override
    public void AddObserver(IObserver observer){
        this.observers.add(observer);
    }
    
    @Override
    public void RemoveObserver(IObserver observer){
        // May have to change this due to how things are stored in the memory
        // observers.remove(observer);
    }
    
    @Override
    public void Notify(){
        for(IObserver observer: this.observers){
            observer.Update();
        }
        
        // After all of the observers are notified reset all of the conditions
        Reset();
    }
}
