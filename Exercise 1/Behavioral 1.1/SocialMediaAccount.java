import java.util.List;

public class SocialMediaAccount implements Subject {
    private List<Observer> followers;  // List of observers (followers)

    @Override
    public void addObserver(Observer o) {
        // Logic to add a new observer (follower)
    }

    @Override
    public void removeObserver(Observer o) {
        // Logic to remove an observer (follower)
    }

    @Override
    public void notifyObservers() {
        // Notify all followers when a new post is created
    }

    public void postNewContent(String post) {
        // Logic to create a new post and notify all followers
    }
}
