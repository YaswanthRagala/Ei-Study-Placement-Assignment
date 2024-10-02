public interface Subject {
    void addObserver(Observer o);     // Add an observer (follower)
    void removeObserver(Observer o);  // Remove an observer
    void notifyObservers();           // Notify all observers about a new event
}
