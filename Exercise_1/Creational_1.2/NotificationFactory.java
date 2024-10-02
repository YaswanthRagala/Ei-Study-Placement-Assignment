// Factory Method to create Notifications
public abstract class NotificationFactory {
    public abstract Notification createNotification();
}

// Factory for creating Email Notifications
public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}

// Factory for creating SMS Notifications
public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
