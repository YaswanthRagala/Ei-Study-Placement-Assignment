public class Follower implements Observer {
    private String followerName;  // Each follower has a name

    public Follower(String name) {
        this.followerName = name;
    }

    @Override
    public void update(String post) {
        // Logic for receiving and processing the notification goes here
    }
}
