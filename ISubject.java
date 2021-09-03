/*
* Author: Josiah Guzman
* Just a simple observer pattern with a pseudo physics engine that allows the audio and achievements systems to work with each other along with the physics engine
* Date Made: 3/31/2021
*/
package ObserverPattern;

public interface ISubject {
    public void AddObserver(IObserver observer);
    public void RemoveObserver(IObserver observer);
    public void Notify();
    }
