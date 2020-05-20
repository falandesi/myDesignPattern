package observer.improve;

public interface Subject {
    void registerObserver(Observe observe);
    void removeObserver(Observe observe);
    void notifyObservers();
}
