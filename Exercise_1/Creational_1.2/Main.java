public class Main {
    public static void main(String[] args) {
        // Create an Email Notification
        NotificationFactory emailFactory = new EmailNotificationFactory();
        Notification emailNotification = emailFactory.createNotification();
        emailNotification.notifyUser("Hello via Email!");

        // Create an SMS Notification
        NotificationFactory smsFactory = new SMSNotificationFactory();
        Notification smsNotification = smsFactory.createNotification();
        smsNotification.notifyUser("Hello via SMS!");
    }
}
