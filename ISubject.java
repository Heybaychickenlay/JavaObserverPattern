/*
* Author: Josiah Guzman
* Just a simple command pattern that has a receiver and supports undoable actions.
* Date Made: 3/31/2021
*/
package ObserverPattern;

public interface ISubject {
    public void AddObserver(IObserver observer);
    public void RemoveObserver(IObserver observer);
    public void Notify();
    }
