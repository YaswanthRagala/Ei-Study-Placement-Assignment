// Concrete Product: Email Notification
public class EmailNotification implements Notification {
    @Override
    public void notifyUser(String message) {
        System.out.println("Email Notification: " + message);
    }
}
