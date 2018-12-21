package design_patterns.ch02_observer_pattern.observer_ours;

public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}