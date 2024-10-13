package factorymethodpatter;

public class SendEmailNotification extends NotificationCenter{

    @Override
    public void sendNotification() {
       Notification notification = getNotification();
        System.out.println(notification.getNotificationContent());
    }

    @Override
    public Notification getNotification() {
        return new EmailNotification();
    }
}
